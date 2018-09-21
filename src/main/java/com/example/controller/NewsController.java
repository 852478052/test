package com.example.controller;

import com.example.pojo.NewsComment;
import com.example.pojo.NewsDetail;
import com.example.service.NewsService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsService service;

    @RequestMapping(path = "/news")
    public String news(@RequestParam(defaultValue = "1")
                      Integer pageNo,Model model){
        Integer pagenoen=1;
        if(pageNo!=null){
            pagenoen=pageNo;
            System.out.println("当前页："+pagenoen);
        }
        Page<NewsComment> page=service.findAllCom(pagenoen,1," ccreatedate desc");
     model.addAttribute("page",page);
      for (NewsComment c:page.getResult()){
          System.out.println(c.getContent());
      }

        return  "news";
    }
    @RequestMapping(path="/index",method= RequestMethod.GET)
    public String index() {
        System.out.println("===================>index...");
        return "redirect:index.html";
    }

    /**
     * 根据时间降序查询所有新闻
     * @return
     */
    @RequestMapping(value="/findNews",method= RequestMethod.POST)
    @ResponseBody
    public List<NewsDetail> findNews() {
        System.out.println("=========================>findNews:");
        List<NewsDetail> list = service.findAllNews();
        for (NewsDetail n:list){
            System.out.println(n.getSummary());
        }
        return list;
    }
}

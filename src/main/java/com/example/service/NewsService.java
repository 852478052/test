package com.example.service;

import com.example.pojo.NewsComment;
import com.example.pojo.NewsDetail;
import com.github.pagehelper.Page;

import java.util.List;

public interface NewsService {
    /**
     * 查询新闻
     * @return
     */
    public List<NewsDetail> findAllNews();

    /**
     * 查询评论
     */
    public Page<NewsComment> findAllCom(int pageNum,int pageSize,String orderBy);
}

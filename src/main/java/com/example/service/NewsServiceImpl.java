package com.example.service;

import com.example.dao.NewsDetailMapper;
import com.example.pojo.NewsComment;
import com.example.pojo.NewsDetail;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@AutoConfigureAfter({NewsDetailMapper.class})
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDetailMapper newsDetailMapper;
    @Override
    public List<NewsDetail> findAllNews() {
        return newsDetailMapper.findAllNews();
    }

    @Override
    public Page<NewsComment> findAllCom(int pageNum,int pageSize,String orderBy) {
        //Page<NewsComment> page= PageHelper.startPage(pageNum, pageSize,orderBy);
        newsDetailMapper.findAllCom();

        return null;
    }
}

package com.example.dao;

import com.example.pojo.NewsComment;
import com.example.pojo.NewsDetail;

import java.util.List;

public interface NewsDetailMapper {

   public List<NewsDetail> findAllNews();

   public List<NewsComment> findAllCom();
}

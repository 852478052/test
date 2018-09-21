package com.example.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class NewsDetail {
   private int id;  //新闻ID
   private String title; //新闻标题
   private String summary;//新闻内容
   private String author;//新闻作者
   private Date createdate;//新闻发布时间
}

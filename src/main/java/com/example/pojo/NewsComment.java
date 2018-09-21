package com.example.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class NewsComment {
   private int cid; //评论ID
   private int newsid; //新闻ID
   private String content; //评论内容
   private String cauthor; //评论人
   private Date ccreatedate; //评论时间
}

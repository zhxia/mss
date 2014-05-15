package com.jd.apps.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jd.apps.dao.NewsMapper;
import com.jd.apps.model.News;

public class NewsService {
    @Autowired
    private NewsMapper newsMapper;

    public News getNewList(int id){
        return newsMapper.selectByPrimaryKey(id);
    }
}

package com.jd.apps.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jd.apps.dao.UserMapper;
import com.jd.apps.model.User;

public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUser(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}

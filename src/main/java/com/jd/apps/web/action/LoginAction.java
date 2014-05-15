package com.jd.apps.web.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.jd.apps.model.News;
import com.jd.apps.model.User;
import com.jd.apps.service.NewsService;
import com.jd.apps.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Autowired
    private UserService userService;

    @Autowired
    private NewsService newsService;


    @Override
    public String execute() throws Exception {
        User u=userService.getUser(1);
        System.out.println(u);
        News news=newsService.getNewList(1);
        System.out.println(news.getContent());
        return INPUT;
    }

}

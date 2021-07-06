package com.bakainory.springbootdemo.controller;

import com.bakainory.springbootdemo.entity.pojo.User;
import com.bakainory.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-06-09 16:50
 **/
@RestController
@RequestMapping("/baka")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String getUser(String userName , String passWord){
        return userService.list(userName , passWord).toString();
    }
}

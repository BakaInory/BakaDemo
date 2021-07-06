package com.bakainory.springbootdemo.service;

import com.bakainory.springbootdemo.entity.pojo.User;

import java.util.List;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-24 16:10
 **/
public interface UserService {
    List<User> list(String userName , String passWord);
}

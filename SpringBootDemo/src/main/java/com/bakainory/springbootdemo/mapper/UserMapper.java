package com.bakainory.springbootdemo.mapper;

import com.bakainory.springbootdemo.entity.pojo.User;

import java.util.List;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-24 16:11
 **/
public interface UserMapper {
    List<User> queryList();
}

package com.bakainory.springbootdemo.testdemo;

import com.bakainory.springbootdemo.mapper.UserMapper;
import com.bakainory.springbootdemo.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-24 16:01
 **/
public class TestDemo {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

}

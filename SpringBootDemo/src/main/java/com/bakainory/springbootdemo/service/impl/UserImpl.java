package com.bakainory.springbootdemo.service.impl;

import com.bakainory.springbootdemo.mapper.UserMapper;
import com.bakainory.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class UserImpl implements UserService {

    @Override
    public List<String> list() {
        return null;
    }
}

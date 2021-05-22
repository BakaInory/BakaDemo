package com.bakainory.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.bakainory.springbootdemo.service.GirlFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-20 20:26
 **/
@RestController
@RequestMapping("/baka")
public class GirlFriendController {
    @Autowired
    private GirlFriendService girlFriendService;

    @RequestMapping("getGirlFriend")
    public String getGirlFriend(){
        return girlFriendService.getGirlFriend().toString();
    }

}




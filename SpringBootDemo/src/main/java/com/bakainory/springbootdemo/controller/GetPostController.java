package com.bakainory.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.bakainory.springbootdemo.entity.param.UserParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-06-15 10:51
 **/
@RestController
@RequestMapping("/baka")
public class GetPostController {
    @RequestMapping(value = "/getPost" , method = RequestMethod.GET)
    public void getPost(){
        System.out.println("get");
    }

    @RequestMapping(value = "/getPost" ,method = RequestMethod.POST)
    public void getPost1(UserParam userParam){
        List<Integer> list = JSON.parseArray(userParam.getType() , Integer.class);
        System.out.println("post");
        if (list == null || list.size() == 0){
            System.out.println("error");
        }else {
            System.out.println(list.toString());
        }
    }
}

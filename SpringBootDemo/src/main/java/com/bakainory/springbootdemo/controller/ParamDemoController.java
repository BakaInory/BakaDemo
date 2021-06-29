package com.bakainory.springbootdemo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-06-07 18:02
 **/
@RestController
@RequestMapping("/baka")
public class ParamDemoController {

    @RequestMapping("/testParam")
    public void ParamDemo(@Param("par") Long par){
        System.out.println(par);
    }
}

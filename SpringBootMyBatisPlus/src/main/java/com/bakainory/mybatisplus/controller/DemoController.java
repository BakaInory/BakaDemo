package com.bakainory.mybatisplus.controller;

import com.bakainory.mybatisplus.service.DemoService;
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
 * @date 2021-07-01 10:54
 **/
@RestController
@RequestMapping("/baka")
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/demo")
    public String demo() {
        return this.demoService.getDemoInfo();
    }
}

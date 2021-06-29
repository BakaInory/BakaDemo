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

    public static void main(String[] args) {
        try {
            User user = null;
            user.getUserName();
        } catch (Exception e ){
            System.out.println(e.getMessage());
        }

        System.out.println("报错之后会不会执行");
    }

}

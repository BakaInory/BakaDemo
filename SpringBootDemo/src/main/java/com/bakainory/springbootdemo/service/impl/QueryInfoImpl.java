package com.bakainory.springbootdemo.service.impl;

import cn.hutool.http.HttpUtil;
import com.bakainory.springbootdemo.service.QueryInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-22 16:12
 **/
@Service
public class QueryInfoImpl implements QueryInfoService {
    @Override
    public void queryInfo() {
        String a = HttpUtil.get("www.baidu.com");
        System.out.println(a);
    }
}

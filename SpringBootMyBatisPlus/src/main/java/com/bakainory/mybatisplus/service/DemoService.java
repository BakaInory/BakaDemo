package com.bakainory.mybatisplus.service;

import com.bakainory.mybatisplus.model.entity.Demo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-07-01 11:04
 **/
public interface DemoService extends IService<Demo> {
    /**
     * 获取Demo信息
     * @return demo 的 name
     */
    String getDemoInfo();
}

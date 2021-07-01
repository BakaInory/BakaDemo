package com.bakainory.mybatisplus.service.impl;

import com.bakainory.mybatisplus.mapper.DemoMapper;
import com.bakainory.mybatisplus.model.entity.Demo;
import com.bakainory.mybatisplus.service.DemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-07-01 10:57
 **/
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper , Demo> implements DemoService{

    @Autowired
    DemoMapper demoMapper;
    @Override
    public String getDemoInfo() {
        int id = 1;
        return this.demoMapper.selectById(id).getName();
    }
}

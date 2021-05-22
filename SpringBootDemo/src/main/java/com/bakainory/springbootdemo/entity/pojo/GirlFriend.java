package com.bakainory.springbootdemo.entity.pojo;

import lombok.Data;

import java.util.HashMap;

/**
 * <p>
 *
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-20 17:38
 **/
@Data
public class GirlFriend {
    private Long id;
    private String name;
    private Double height;
    private Double weight;
    private HashMap<String,Double> threeSize;
}

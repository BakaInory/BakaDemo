package com.bakainory.springbootdemo.service.impl;

import com.bakainory.springbootdemo.entity.pojo.GirlFriend;
import com.bakainory.springbootdemo.service.GirlFriendService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-20 17:59
 **/
@Service
public class GirlFriendImpl implements GirlFriendService {

    @Override
    public GirlFriend getGirlFriend() {
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.setName("高桥李依");
        girlFriend.setHeight(160.00);
        girlFriend.setWeight(50.00);
        return girlFriend;
    }

}

package com.bakainory.springbootdemo.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-24 15:53
 **/

@TableName(value = "User")
@Data
public class User {
    @TableId(value = "id")
    private Integer id;

    @TableField("user_name")
    private String UserName;

    @TableField("type")
    private List<String> type;

}

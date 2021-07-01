package com.bakainory.mybatisplus.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-07-01 11:11
 **/
@TableName(value = "baka_demo")
@Data
public class Demo {
    @TableId(value = "id" , type = IdType.AUTO)
    Integer id;

    @TableField(value = "name")
    String name;
}

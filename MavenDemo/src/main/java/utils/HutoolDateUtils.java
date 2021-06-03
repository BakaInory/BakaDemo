package utils;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;

import java.sql.Time;
import java.util.Date;
import java.util.HashMap;

/**
 * <p>
 *     Demo for HutoolDateUtil
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-26 11:52
 **/
public class HutoolDateUtils {
    public static void main(String[] args) {
        String jsonStr = "{\"Dissatisfied\" : \"100\",\"General\":\"100\",\"Satisfaction\":\"100\",\"VerySatisfaction\":\"100\"}";
        HashMap hashMap = JSONUtil.toBean(jsonStr, HashMap.class);

    }
}

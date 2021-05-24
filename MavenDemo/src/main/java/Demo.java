import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * <p>
 * TODO..
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-19 21:47
 **/
public class Demo {
    public static void main(String[] args) {
        String a = HttpUtil.get("https://www.baidu.com");
        System.out.println(a);
    }
}

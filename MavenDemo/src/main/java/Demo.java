import cn.hutool.core.date.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *     入口类
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-05-19 21:47
 **/
public class Demo {
    public static void main(String[] args) {
        int yesterdayOfWeek = DateUtil.dayOfWeek(DateUtil.parseDate("2021-6-5"));
        System.out.println(yesterdayOfWeek);
    }
}

import entity.AccountHandle;
import enums.EnumDemo;

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
        try {
            AccountHandle accountHandle = new AccountHandle(-2.3);
            System.out.println(EnumDemo.SUCCESS.getMessage());
        } catch (Exception e){
            System.out.println(EnumDemo.SERVER_ERROR.getMessage());
            try {
                AccountHandle accountHandle = null;
                accountHandle.deposit();
            } catch (NullPointerException npe){
                System.out.println(EnumDemo.NOT_FOUND.getMessage());
            }catch (Exception ae){
                System.out.println(EnumDemo.SERVER_ERROR.getMessage());
            }
        }
    }
}

package entity;

/**
 * <p>
 *     弱智徐川的Demo
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-06-01 14:54
 **/
public class AccountHandle {
    public static double annualInterestRate;

    public double balance;

    public AccountHandle() {
    }

    public AccountHandle(double balance) throws Exception{
        if(balance < 0){
            throw new Exception("只能传入整数");
        }
        this.balance = balance;
    }

    public void deposit(){

    }
}

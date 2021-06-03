package enums;

/**
 * <p>
 *     撒比徐川的枚举Demo
 * </p>
 *
 * @author BakaInory
 * @version 1.0
 * @date 2021-06-02 11:10
 **/
public enum EnumDemo {
    /**
     * 请求成功
     */
    SUCCESS("200" , "请求成功"),

    /**
     * 未找到
     */
    NOT_FOUND("404" , "请求未找到"),

    /**
     * 服务器错误
     */
    SERVER_ERROR("500" , "服务器错误");

    private String code;
    private String message;

    EnumDemo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package dingshi.com.hibook.retrofit.exception;

/**
 * 自定义服务器错误
 *
 * @author ZhongDaFeng
 */
public class ServerException extends RuntimeException {
    private int code;
    private String msg;

    public ServerException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "ServerException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}

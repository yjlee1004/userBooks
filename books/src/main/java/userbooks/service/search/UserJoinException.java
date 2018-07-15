package userbooks.service.search;

/**
 * Created by yjlee on 2018-07-14.
 */
public class UserJoinException extends RuntimeException{
    public UserJoinException() {
        super("User Join Fail");
    }

    public UserJoinException(String message) {
        super(message);
    }

    public UserJoinException(String message, Throwable cause) {
        super(message, cause);
    }
}

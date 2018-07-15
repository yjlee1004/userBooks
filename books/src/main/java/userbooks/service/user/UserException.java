package userbooks.service.user;

/**
 * Created by yjlee on 2018-07-15.
 */
public class UserException extends RuntimeException {
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}

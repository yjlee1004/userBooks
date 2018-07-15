package userbooks.service.search;

/**
 * Created by yjlee on 2018-07-14.
 */
public class BookSearchException extends RuntimeException {

    public BookSearchException() {
        super("Book Search Exception");
    }

    public BookSearchException(String message) {
        super(message);
    }

    public BookSearchException(String message, Throwable cause) {
        super(message, cause);
    }
}

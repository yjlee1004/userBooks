package userbooks.service.search;

/**
 * Created by yjlee on 2018-07-14.
 */
public class SearchHistoryException extends RuntimeException {

    public SearchHistoryException() {
        super("SearchHistory Exception");
    }

    public SearchHistoryException(String message) {
        super(message);
    }

    public SearchHistoryException(String message, Throwable cause) {
        super(message, cause);
    }
}

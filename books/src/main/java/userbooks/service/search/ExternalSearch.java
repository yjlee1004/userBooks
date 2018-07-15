package userbooks.service.search;

/**
 * Created by yjlee on 2018-07-14.
 */
public interface ExternalSearch<T,R> {

    public R getSearchData(T t);

}

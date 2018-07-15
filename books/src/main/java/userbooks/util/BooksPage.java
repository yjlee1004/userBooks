package userbooks.util;

import java.util.List;

/**
 * Created by yjlee on 2018-07-14.
 */
public interface BooksPage<E> {

    Boolean hasContent();
    List<E> getContent();

    Integer getTotalPage();
    Integer getCurrentPage();

    Integer getViewStartPage();
    Integer getViewLastPage();

    Integer getViewPage();
    void setViewPage(int num);

    Long getTotalElements();
    Integer getPageSize();

}

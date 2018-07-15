package userbooks.util;

import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yjlee on 2018-07-14.
 */
public class BooksPageImpl<E> implements BooksPage {

    private final List<E> content = new ArrayList<E>();
    private final int totalPages;
    private final int currentPages;
    private int viewPages;
    private long totalElements;
    private int pageSize;

    public BooksPageImpl(List<E> content, Page<?> t) {
        this.content.addAll(content);
        this.totalPages   = t.getTotalPages();
        this.currentPages = t.getNumber();
        this.viewPages = 10;
        this.totalElements = t.getTotalElements();
        this.pageSize = t.getSize();
    }

    @Override
    public Boolean hasContent() {
        return !content.isEmpty();
    }

    @Override
    public List<E> getContent() {
        return Collections.unmodifiableList(content);
    }

    @Override
    public Integer getTotalPage() {
        return totalPages;
    }

    @Override
    public Integer getCurrentPage() {
        return currentPages;
    }

    @Override
    public Integer getViewStartPage() {
        int idx = 0;
        try{
            idx = (int)Math.floor((double)this.currentPages / this.viewPages) ;
            if(idx > 0) idx = idx * this.viewPages;
        }catch(Exception e){
        }
        return idx;
    }

    @Override
    public Integer getViewLastPage() {
        int idx2 = getViewStartPage() + this.viewPages - 1;
        return (this.totalPages > idx2)? idx2 : this.totalPages;
    }

    @Override
    public Integer getViewPage() {
        return this.viewPages;
    }

    @Override
    public void setViewPage(int num) {
        this.viewPages = num;
    }

    @Override
    public Long getTotalElements() {
        return totalElements;
    }

    @Override
    public Integer getPageSize() {
        return this.pageSize;
    }
}

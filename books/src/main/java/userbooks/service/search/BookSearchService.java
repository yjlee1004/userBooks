package userbooks.service.search;

import userbooks.dto.BookDto;
import userbooks.dto.UserDto;
import userbooks.util.BooksPage;

/**
 * Created by yjlee on 2018-07-14.
 */
public interface BookSearchService {

    public BooksPage<BookDto> getBooks(String searchWord,UserDto userDto);


}

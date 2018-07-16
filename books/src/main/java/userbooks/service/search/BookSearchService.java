package userbooks.service.search;

import org.springframework.data.domain.Pageable;
import userbooks.dto.BookDto;
import userbooks.dto.KakaoSearchDataDto;
import userbooks.dto.UserDto;
import userbooks.util.BooksPage;

/**
 * Created by yjlee on 2018-07-14.
 */
public interface BookSearchService {

    public BooksPage<BookDto> getBooks(KakaoSearchDataDto kakaoSearchDataDto, UserDto userDto);


}

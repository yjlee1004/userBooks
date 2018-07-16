package userbooks.service.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import userbooks.dto.*;
import userbooks.service.history.SearchHistory;
import userbooks.util.BooksPage;
import userbooks.util.BooksPageImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yjlee on 2018-07-15.
 */
@Service
public class BookSearchServiceImpl implements BookSearchService {

    @Autowired
    SearchHistory searchHistory;


    @Autowired
    ExternalSearchFactory externalSearchFactory;

    @Override
    @Transactional
    public BooksPage<BookDto> getBooks(KakaoSearchDataDto kakaoSearchDataDto, UserDto userDto) {
        BooksPage<BookDto> bookList = null;
        ExternalSearch externalSearch = externalSearchFactory.getSearchBean(ExternalSearchCompany.KAKAO);
        KakaoSearchResultDto kakaoSearchResultDto = (KakaoSearchResultDto) externalSearch.getSearchData(kakaoSearchDataDto);
        List<BookDto> bookDtos = new ArrayList<>();
        searchHistory.save(new SearchWordDto(kakaoSearchDataDto.getSearchWord(),userDto));

        return new BooksPageImpl<BookDto>(bookDtos,new PageImpl<BookDto>(bookDtos
                ,kakaoSearchDataDto.getPageable(),kakaoSearchResultDto.getKakaoBookHeader().getTotalCount()));
    }
}

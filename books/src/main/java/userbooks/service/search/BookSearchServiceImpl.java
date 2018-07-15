package userbooks.service.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import userbooks.dto.BookDto;
import userbooks.dto.SearchWordDto;
import userbooks.dto.UserDto;
import userbooks.service.history.SearchHistory;
import userbooks.util.BooksPage;

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
    public BooksPage<BookDto> getBooks(String searchWord,UserDto userDto) {
        BooksPage<BookDto> bookList;
        ExternalSearch externalSearch = externalSearchFactory.getSearchBean(ExternalSearchCompany.KAKAO);
        externalSearch.getSearchData(searchWord);
        searchHistory.save(new SearchWordDto(searchWord,userDto));
        return null;
    }
}

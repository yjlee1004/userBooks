package userbooks.service.history;

import userbooks.dto.SearchWordDto;
import userbooks.dto.UserDto;

import java.util.List;

/**
 * Created by yjlee on 2018-07-15.
 */
public interface SearchHistory {

    void save(SearchWordDto searchWordDto);

    List<SearchWordDto> getRecentSearchWord(UserDto userDto);

}

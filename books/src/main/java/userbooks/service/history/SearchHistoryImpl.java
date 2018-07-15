package userbooks.service.history;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userbooks.dao.SearchHistoryRepository;
import userbooks.dto.SearchWordDto;
import userbooks.dto.UserDto;
import userbooks.model.SearchWord;
import userbooks.model.User;
import userbooks.service.search.SearchHistoryException;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by yjlee on 2018-07-15.
 */
@Service
public class SearchHistoryImpl implements SearchHistory{

    @Autowired
    SearchHistoryRepository searchHistoryRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void save(SearchWordDto searchWordDto) {

        if(searchWordDto == null) throw new SearchHistoryException("searchWordDto should not null");
        if(searchWordDto.getUserDto() == null || searchWordDto.getUserDto().getNo() ==null)
            throw new SearchHistoryException("userDto is invalid info");
        if(searchWordDto.getWord() == null || searchWordDto.getWord().isEmpty())
            throw new SearchHistoryException("word should not null or empty");

        User user = modelMapper.map(searchWordDto.getUserDto(),User.class);
        SearchWord searchWord = modelMapper.map(searchWordDto,SearchWord.class);
        searchWord.setUserNo(user);
        searchHistoryRepository.save(searchWord);
    }

    @Override
    public List<SearchWordDto> getRecentSearchWord(UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);
        List<SearchWord> searchWords = searchHistoryRepository.findTop10ByUserNoOrderByNoDesc(user);
        return searchWords.stream().map(value -> modelMapper.map(value ,SearchWordDto.class)).collect(toList());
    }
}

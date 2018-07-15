package userbooks.service.search;

import org.springframework.stereotype.Service;
import userbooks.dto.GoogleSearchDataDto;
import userbooks.dto.GoogleSearchResultDto;

/**
 * Created by yjlee on 2018-07-14.
 */

@Service
public class ExternalGoogleBookSearch implements ExternalSearch<GoogleSearchDataDto, GoogleSearchResultDto> {
    @Override
    public GoogleSearchResultDto getSearchData(GoogleSearchDataDto googleSearchDataDto) {
        return null;
    }
}

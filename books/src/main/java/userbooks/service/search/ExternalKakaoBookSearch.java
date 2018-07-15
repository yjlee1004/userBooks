package userbooks.service.search;

import org.springframework.stereotype.Service;
import userbooks.dto.KakaoSearchDataDto;
import userbooks.dto.KakaoSearchResultDto;

/**
 * Created by yjlee on 2018-07-14.
 */

@Service
public class ExternalKakaoBookSearch implements ExternalSearch<KakaoSearchDataDto,KakaoSearchResultDto> {

    @Override
    public KakaoSearchResultDto getSearchData(KakaoSearchDataDto kakaoSearchDataDto) {
        return null;
    }
}

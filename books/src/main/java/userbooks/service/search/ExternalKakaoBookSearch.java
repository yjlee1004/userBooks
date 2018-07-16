package userbooks.service.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import userbooks.KakaoBookSearchConfiguration;
import userbooks.dto.KakaoSearchDataDto;
import userbooks.dto.KakaoSearchResultDto;
import userbooks.util.ObjectChecker;

import java.net.URI;

/**
 * Created by yjlee on 2018-07-14.
 */

@Service
public class ExternalKakaoBookSearch implements ExternalSearch<KakaoSearchDataDto,KakaoSearchResultDto> {


    @Autowired
    KakaoBookSearchConfiguration kakaoBookSearchConfiguration;

    static final String AUTH ="Authorization";
    static final String TARGET = "TARGET";
    static final String TITLE = "title";
    static final String QUERY = "query";
    static final String PAGE = "page";
    static final String SIZE = "size";

    @Override
    public KakaoSearchResultDto getSearchData(KakaoSearchDataDto kakaoSearchDataDto) {

        ObjectChecker.shouldNotNull(kakaoSearchDataDto,"kakaoSearchDataDto should not null");
        ObjectChecker.shouldNotNullEmpty(kakaoSearchDataDto.getSearchWord(),"searchWord should not null or empty");
        ObjectChecker.shouldNotNull(kakaoSearchDataDto.getPageable(),"pageable should not null");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add(AUTH, kakaoBookSearchConfiguration.appKey);

        MultiValueMap params = new LinkedMultiValueMap<>();
        params.add(TARGET,TITLE);
        params.add(QUERY,kakaoSearchDataDto.getSearchWord());
        params.add(PAGE,kakaoSearchDataDto.getPageable().getPageNumber());
        params.add(SIZE,kakaoSearchDataDto.getPageable().getPageSize());
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(kakaoBookSearchConfiguration.uri)
                .queryParams(params).build();
        URI requestUrl = uri.toUri();

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<KakaoSearchResultDto> kakaoSearchResultDtoHttpEntity = new HttpEntity<>(headers);
        ResponseEntity<KakaoSearchResultDto> response = restTemplate.exchange(requestUrl.toString(), HttpMethod.GET
                ,kakaoSearchResultDtoHttpEntity,KakaoSearchResultDto.class);
        return response.getBody();
    }
}

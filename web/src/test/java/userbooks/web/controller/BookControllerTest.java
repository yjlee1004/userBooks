package userbooks.web.controller;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import userbooks.dto.KakaoSearchResultDto;

import java.net.URI;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Created by yjlee on 2018-07-15.
 */
public class BookControllerTest {

    @Test
    public void given_when_then(){

        RestTemplate restTemplate = new RestTemplate();

        String appKey = "6bea372f64c60f4ab04233236dff4d6b";
        String authValue = "KakaoAK " + appKey;
        String url = "https://dapi.kakao.com/v2/search/book?target=title";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", authValue);

        MultiValueMap params = new LinkedMultiValueMap<>();
        params.add("query","미움");
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).queryParams(params).build();
//                .encode(Charset.defaultCharset());
        URI requestUrl = uri.toUri();

        System.out.println(" uri : " + requestUrl.getPath());

        HttpEntity<KakaoSearchResultDto> request = new HttpEntity<KakaoSearchResultDto>(headers);

//        restTemplate.getMessageConverters().add(0,new StringHttpMessageConverter(Charset.forName("UTF-8")));

        ResponseEntity<KakaoSearchResultDto> response = restTemplate.exchange(requestUrl.toString()
                , HttpMethod.GET, request, KakaoSearchResultDto.class);
        KakaoSearchResultDto  result = response.getBody();

        System.out.printf("result : " + result);
    }


}
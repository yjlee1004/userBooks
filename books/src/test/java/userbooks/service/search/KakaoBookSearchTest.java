package userbooks.service.search;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Created by yjlee on 2018-07-15.
 */
public class KakaoBookSearchTest {


    @Test
    public void given_when_then(){

        RestTemplate restTemplate = new RestTemplate();

        String authValue = " KakaoAK kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        String url = "https://dapi.kakao.com/v2/search/book?target=title";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", authValue);

        MultiValueMap params = new LinkedMultiValueMap<>();
        params.add("query","미움받을용기");
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).queryParams(params).build()
                .encode(Charset.defaultCharset());
        URI requestUrl = uri.toUri();


        System.out.printf(" uri : " + requestUrl.toString());

        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(requestUrl.toString(), HttpMethod.GET, request, String.class);
        String  result = response.getBody();

        System.out.printf("result : " + result);
    }

}
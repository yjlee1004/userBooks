package userbooks.service.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import userbooks.dto.KakaoSearchDataDto;
import userbooks.test.TestEnv;

import static org.junit.Assert.*;

/**
 * Created by yjlee on 2018-07-16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class ExternalKakaoBookSearchTest extends TestEnv {


    @Autowired
    ExternalKakaoBookSearch externalKakaoBookSearch;

    @Test
    public void given_when_then(){
        KakaoSearchDataDto kakaoSearchDataDto = new KakaoSearchDataDto();
        externalKakaoBookSearch.getSearchData(kakaoSearchDataDto);
    }

}
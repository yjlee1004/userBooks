package userbooks.service.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by yjlee on 2018-07-14.
 */
@Service
public class ExternalSearchFactory {

    @Autowired
    @Qualifier("externalGoogleBookSearch")
    ExternalSearch externalGoogleBookSearch;

    @Qualifier("externalKakaoBookSearch")
    ExternalSearch externalKakaoBookSearch;

    public ExternalSearch getSearchBean(ExternalSearchCompany externalSearchCompany){
        switch (externalSearchCompany){
            case KAKAO:
                return externalKakaoBookSearch;
            case GOOGLE:
                return externalGoogleBookSearch;
        }

        throw new BookSearchException("Not Support Search Compnay");
    }


}

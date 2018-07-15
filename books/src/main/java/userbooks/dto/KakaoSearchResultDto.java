package userbooks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by yjlee on 2018-07-14.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KakaoSearchResultDto implements Serializable {

    @JsonProperty("meta")
    KakaoBookSearchHeader kakaoBookHeader;


    @JsonProperty("document")
    KakaoBookSearchDocument kakaoBookSearchDocument;


}

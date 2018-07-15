package userbooks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import userbooks.util.BooksPage;

import java.io.Serializable;

/**
 * Created by yjlee on 2018-07-15.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KakaoBookSearchHeader implements Serializable {

    @JsonProperty("totalCount")
    Integer totalCount;

    @JsonProperty("pageable_count")
    Integer pageableCount;

    @JsonProperty("is_end")
    BooksPage isEnd;

}

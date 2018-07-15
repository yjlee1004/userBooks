package userbooks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yjlee on 2018-07-14.
 */
@Data
@NoArgsConstructor
public class BookDto {
    String title;
    String contents;
    String url;
    String datetime;
    Integer price;
    Integer salePrice;
    String saleYn;
    String category;
}

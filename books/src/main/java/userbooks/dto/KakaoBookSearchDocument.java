package userbooks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by yjlee on 2018-07-15.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KakaoBookSearchDocument implements Serializable {

    @JsonProperty("title")
    String title;

    @JsonProperty("contents")
    String contents;

    @JsonProperty("url")
    String url;

    @JsonProperty("isbn")
    String isbn;

    @JsonProperty("datetime")
    String datetime;

    @JsonProperty("authors")
    String[] authors;

    @JsonProperty("publisher")
    String publisher;

    @JsonProperty("translators")
    String[] translators;

    @JsonProperty("price")
    Integer price;

    @JsonProperty("sale_price")
    Integer salePrice;

    @JsonProperty("sale_yn")
    String saleYn;

    @JsonProperty("category")
    String category;

    @JsonProperty("thumbnail")
    String thumbnail;

    @JsonProperty("barcode")
    String barcode;
    @JsonProperty("ebook_barcode")
    String ebookBarcode;
    @JsonProperty("status")
    String status;

}

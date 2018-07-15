package userbooks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by yjlee on 2018-07-14.
 */
@Data
public abstract class ResponseDto {

    @JsonProperty
    String result;

    @JsonProperty
    String msg;
}

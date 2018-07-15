package userbooks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yjlee on 2018-07-14.
 */
public class JoinResponseDto /*extends ResponseDto*/{

    @JsonProperty
    String result;
    @JsonProperty
    String msg;
    public JoinResponseDto(String result, String msg) {
        /*super(result, msg)*/;
        this.result = result;
        this.msg = msg;
    }

}

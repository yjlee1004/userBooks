package userbooks.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import userbooks.model.User;

/**
 * Created by yjlee on 2018-07-14.
 */

@Data
@NoArgsConstructor
public class SearchWordDto {

    long no;
    String word;
    UserDto userDto;

    public SearchWordDto(long no, String word) {
        this.no = no;
        this.word = word;
    }

    public SearchWordDto(long no, String word, UserDto userDto) {
        this.no = no;
        this.word = word;
        this.userDto = userDto;
    }

    public SearchWordDto(String word, UserDto userDto) {
        this.word = word;
        this.userDto = userDto;
    }
}

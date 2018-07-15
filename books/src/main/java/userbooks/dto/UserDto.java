package userbooks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yjlee on 2018-07-14.
 */
@Data
@NoArgsConstructor
public class UserDto {

    Long no;
    String id;
    String password;
    String name;

}

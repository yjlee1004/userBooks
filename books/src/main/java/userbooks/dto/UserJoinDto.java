package userbooks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yjlee on 2018-07-14.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserJoinDto {

    String id;
    String name;
    String password;
    String rePassword;

}

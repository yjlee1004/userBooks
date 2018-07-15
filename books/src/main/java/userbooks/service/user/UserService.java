package userbooks.service.user;

import userbooks.dto.UserDto;
import userbooks.dto.UserJoinDto;

/**
 * Created by yjlee on 2018-07-15.
 */
public interface UserService {
    void join(UserJoinDto userJoinDto);
    UserDto getByUserno(Long userNo);
    UserDto getById(String id);
}

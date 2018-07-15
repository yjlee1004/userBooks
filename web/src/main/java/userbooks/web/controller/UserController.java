package userbooks.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import userbooks.dto.JoinResponseDto;
import userbooks.dto.UserJoinDto;
import userbooks.service.search.UserJoinException;
import userbooks.service.user.UserService;

/**
 * Created by yjlee on 2018-07-13.
 */
@Controller
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/join")
    public String join(){
        return "user/join";
    }

    @PostMapping("/join")
    @ResponseBody
    public JoinResponseDto create(@RequestBody UserJoinDto userJoinDto){
        try {
            log.info("join request  , userJoinDto {} " , userJoinDto);
            userService.join(userJoinDto);
            JoinResponseDto joinResponseDto = new JoinResponseDto("OK", "Success");
            return joinResponseDto;
        }catch (UserJoinException e){
            log.error("join Error , Error " ,e);
            return new JoinResponseDto("FAIL",e.getMessage());
        }catch (Exception e){
            log.error("Error " , e);
            return new JoinResponseDto("FAIL","System Error");
        }
    }

}

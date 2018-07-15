package userbooks.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by yjlee on 2018-07-09.
 */

@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String loginForm(){

        return "user/login";

    }
}

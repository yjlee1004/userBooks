package userbooks.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yjlee on 2018-07-08.
 */

@Controller
public class IndexController {

    @RequestMapping("/yjlee")
    @ResponseBody
    public String index(){
        return "hello index";
    }

    @RequestMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}

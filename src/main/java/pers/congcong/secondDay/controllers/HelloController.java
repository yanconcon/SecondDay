package pers.congcong.secondDay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/25 0025.
 */

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}

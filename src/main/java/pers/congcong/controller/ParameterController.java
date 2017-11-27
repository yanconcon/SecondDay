package pers.congcong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/11/25 0025.
 */
@Controller
public class ParameterController {

    @RequestMapping(value = "/parame",method = RequestMethod.POST, headers = "Referer = http://www.congcong.com")
    public String hello(){
        return "hello";
    }
}

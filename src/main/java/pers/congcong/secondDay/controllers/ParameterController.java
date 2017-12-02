package pers.congcong.secondDay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/11/25 0025.
 */
@Controller
public class ParameterController {

    @RequestMapping(value = "/parame",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}

package pers.congcong.secondDay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/2 0002.
 */
@Controller
@RequestMapping(value = "/test")
public class DataBindingController {

    @RequestMapping(value = "")
    public String dataBindingTest(){
        return "databindingtest";
    }

    @RequestMapping(value = "/pathVariableTest/{userId}")
    public String pathVariableTest(
//            通过@PathVariable获取链接上的动态参数
            @PathVariable Integer userId
    ) {
        System.out.println("rio @PathVariable get"+userId);
        return "databindingtest";
    }

    @RequestMapping(value = "requestHeaderTest")
    public String requestHeaderTest(
            //            通过@CookieValue得到Header中的参数
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader("User-Agent") String[] accept
            ) {
        System.out.println("rio @RequestHeader get "+ userAgent);
        for (String a : accept){
            System.out.println("rio @RequestHeader get "+ userAgent);
        }
        return "databindingtest";

    }


    @RequestMapping(value = "cookieValueTest")
    public String cookieValueTest(
//            通过@CookieValue得到cookie中的JSESSIONID参数
            @CookieValue(value = "JSESSIONID",defaultValue = "1") String sessionId
    ){
        System.out.println(sessionId);
        return "databindingtest";

    }
}

package pers.congcong.secondDay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/2 0002.
 */
@Controller
@RequestMapping("modelAttribute")
public class ModelAttributeTestController {
//    使用@ModelAttribute注释的value属性，来指定model属性的名称，model属性的值就是方法的返回值
    @ModelAttribute("loginName")
    public String userModel1(
            @RequestParam("loginName") String loginName
    ){
        return loginName;
    }

    @RequestMapping("/login1")
    public String login1(){
                return "result1";
    }
}

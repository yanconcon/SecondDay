package pers.congcong.secondDay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import pers.congcong.secondDay.pojos.User;

/**
 * Created by Administrator on 2017/12/2 0002.
 */
@Controller
@SessionAttributes("user")
//把Model中的属性名为"user"的属性存入HttpSession中
@RequestMapping("/sessionAttributeTest")
public class SessionAttributesController {
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName){
        return formName;
    }

    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("loginName") String loginName,
            @RequestParam("passWord") String passWord,
            Model model
    ){
        User user = new User();
        user.setUserName("admin");
        user.setPassWord(passWord);
        user.setLoginName(loginName);
        model.addAttribute("user",user);
        return "welcome";
    }
}

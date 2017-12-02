package pers.congcong.secondDay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pers.congcong.secondDay.pojos.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/2 0002.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static List<User> userList;
    public UserController() {
        super();
        userList = new ArrayList<User>();
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String requesterForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register" ,method = RequestMethod.POST)
    public String register(@RequestParam("loginName") String loginName,
//          通过@RequestParam注释拿到post中的参数，然后给String赋值
            @RequestParam("passWord") String passWord,
            @RequestParam("userName") String userName) {
        User user = new User();
        user.setLoginName(loginName);
        user.setPassWord(passWord);
        user.setUserName(userName);
        userList.add(user);

        return "loginForm";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam("loginName") String loginName,
            @RequestParam("passWord") String passWord,
            Model model
    ){
        for (User user : userList){
            System.out.println(user.getLoginName());
            if (user.getLoginName().equals(loginName)&&user.getPassWord().equals(passWord)){
                model.addAttribute("user", user);
                return "welcome";
            }
        }
        return "loginForm";
    }
}

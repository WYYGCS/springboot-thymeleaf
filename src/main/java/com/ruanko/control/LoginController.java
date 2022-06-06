package com.ruanko.control;

import com.ruanko.entity.User;
import com.ruanko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Title: UserController
 * Description:
 * 用户控制层
 * Version:1.0.0
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String index() {
        return "redirect:/toLogin";
    }
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String loginMatch(User user){
        System.out.println("/login:接收页面账号密码数据");
        boolean flag;
        flag=userService.matchingPassword(user);
        if(flag) return "loginSuccess";
        else return "loginFail";
    }
}
package com.example.admin.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
        //处理具体业务逻辑
        if(username.equals("admin") && password.equals("123456")) {
            session.setAttribute("loginUser", username); // Set loginUser in session
            model.addAttribute("msg", "登录成功");
            return "dashboard";
        }

        else{
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("loginUser");
        return "index";
    }
}

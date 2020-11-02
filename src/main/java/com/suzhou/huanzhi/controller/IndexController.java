package com.suzhou.huanzhi.controller;

import com.suzhou.huanzhi.entity.User;
import com.suzhou.huanzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    UserService userservice;
    
    @GetMapping(value = {"/login"})
    public String login(){
        return "page/login-3";
    }

    @PostMapping("/login_into")
    @ResponseBody
    public String login_into(User user, HttpSession session){
        String email = user.getEmail();
        User get_user = userservice.queryByName(email);
        if (get_user==null){
            return "0";
        }
        else{
            if (get_user.getPassword().equals(user.getPassword())){
                session.setAttribute("user",get_user);
                return "200";
            }
            else{
                return "500";
            }

        }

    }

    @GetMapping(value = {"/admin/index","/admin/"})
    public String index(HttpSession session){
        Object ses = session.getAttribute("user");
        if (ses==null){
            return "redirect:/login";
        }
        else{
        return "index";
    }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/login";
    }
}

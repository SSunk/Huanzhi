package com.suzhou.huanzhi.controller;

import com.suzhou.huanzhi.entity.All_Info;
import com.suzhou.huanzhi.entity.Manage;
import com.suzhou.huanzhi.entity.User;
import com.suzhou.huanzhi.service.ManageService;
import com.suzhou.huanzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    ManageService manageService;

    @ResponseBody
    @GetMapping("/admin/get_users")
    public HashMap get_users(){
        HashMap data = new HashMap();
        List<User> itemlist = userService.queryAll();
        if (itemlist.size()!=0){
            data.put("code",0);
            data.put("msg","");
            data.put("count",itemlist.size());
            data.put("data",itemlist);
        }
        return data;
    }

    @GetMapping("/admin/edit_user")
    public ModelAndView edit_user(){
        ModelAndView mv =new ModelAndView();
        List<Manage> itemlist = manageService.queryAll();
        if (itemlist.size()!=0){
            mv.addObject("typeList1",itemlist);
            mv.setViewName("page/table/edituser");
        }
        return mv;
    }

    @GetMapping("/admin/add_user")
    public ModelAndView add_user(){
        ModelAndView mv =new ModelAndView();
        List<Manage> itemlist = manageService.queryAll();
        if (itemlist.size()!=0){
            mv.addObject("typeList1",itemlist);
            mv.setViewName("page/table/adduser");
        }
        return mv;
    }

    @ResponseBody
    @PostMapping("/admin/update_user")
    public String update_user(User user) {
        if (user.getId()==null){
            User us = userService.queryByName(user.getEmail());
            if (us==null){
                userService.insert(user);
                return "添加成功";

            }
            else {
                return "账户已存在";
            }
        }
        else {
            userService.update(user);
            return "更新成功";

        }
    }





}

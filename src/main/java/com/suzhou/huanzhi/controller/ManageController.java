package com.suzhou.huanzhi.controller;

import com.suzhou.huanzhi.entity.Manage;
import com.suzhou.huanzhi.entity.User;
import com.suzhou.huanzhi.service.ManageService;
import com.suzhou.huanzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
public class ManageController {

    @Autowired
    ManageService manageService;

    @ResponseBody
    @GetMapping("/admin/get_manager")
    public HashMap get_manager(){
        HashMap data = new HashMap();
        List<Manage> itemlist = manageService.queryAll();
        if (itemlist.size()!=0){
            data.put("code",0);
            data.put("msg","");
            data.put("count",itemlist.size());
            data.put("data",itemlist);
        }
        return data;
    }

    @ResponseBody
    @PostMapping("/admin/edit_manage")
    public String edit_manage(Manage manage){

        if (manage.getId()==null){
            manageService.insert(manage);
            return "添加成功";
        }
        else {
            manageService.update(manage);
            return "更新成功";
        }







}
    @RequestMapping("/admin/manage_del/{id}")
    @ResponseBody
    public String del_zz(@PathVariable("id") Integer id){
        manageService.deleteById(id);
        return "删除成功";

    }

}

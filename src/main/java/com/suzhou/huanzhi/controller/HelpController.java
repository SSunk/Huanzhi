package com.suzhou.huanzhi.controller;


import com.suzhou.huanzhi.entity.HA;
import com.suzhou.huanzhi.entity.HB;
import com.suzhou.huanzhi.entity.Manage;
import com.suzhou.huanzhi.entity.User;
import com.suzhou.huanzhi.service.HAService;
import com.suzhou.huanzhi.service.HBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
public class HelpController {

    @Autowired
    private HAService haService;

    @Autowired
    private HBService hbService;

    @ResponseBody
    @GetMapping("/admin/getHelpA")
    public HashMap getHelpA(){
        HashMap data = new HashMap();
        List<HA> itemlist = haService.queryAll();
        if (itemlist.size()!=0){
            data.put("code",0);
            data.put("msg","");
            data.put("count",itemlist.size());
            data.put("data",itemlist);
        }
        return data;


    }

    @GetMapping("/admin/add_HA")
    public String add_HA(){
        return "page/table/addH_A";
    }

    @GetMapping("/admin/add_HB")
    public String add_HB(){
        return "page/table/addH_B";
    }

    @GetMapping("/admin/edit_HA")
    public String edit_Ha_in(){
        return "page/table/edit_HA";
    }

    @GetMapping("/admin/edit_HB")
    public String edit_Hb_in(){
        return "page/table/edit_HB";
    }

    @ResponseBody
    @PostMapping("/admin/insert_A")
    public String insert_A(HA ha){
        System.out.println("11111111111111111111111111111");
        System.out.println(ha.getHelpA());
        if (ha.getId()==null){

            haService.insert(ha);
            return "添加成功";
        }
        else {
            haService.update(ha);
            return "更新成功";

        }



    }

    @ResponseBody
    @PostMapping("/admin/insert_B")
    public String insert_B(HB hb){

        if (hb.getId()==null){

            hbService.insert(hb);
            return "添加成功";
        }
        else {
            hbService.update(hb);
            return "更新成功";

        }



    }

    @ResponseBody
    @GetMapping("/admin/getHelpB")
    public HashMap getHelpB(){
        HashMap data = new HashMap();
        List<HB> itemlist = hbService.queryAll();
        if (itemlist.size()!=0){
            data.put("code",0);
            data.put("msg","");
            data.put("count",itemlist.size());
            data.put("data",itemlist);
        }
        return data;


    }





}

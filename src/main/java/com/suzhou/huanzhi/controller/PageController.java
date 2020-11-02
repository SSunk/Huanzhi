package com.suzhou.huanzhi.controller;

import com.suzhou.huanzhi.entity.BaseContract;
import com.suzhou.huanzhi.entity.HA;
import com.suzhou.huanzhi.entity.HB;
import com.suzhou.huanzhi.service.BaseContractService;
import com.suzhou.huanzhi.service.HAService;
import com.suzhou.huanzhi.service.HBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class PageController {
    @Autowired
    BaseContractService baseContractService;

    @Autowired
    HBService hbService;

    @Autowired
    HAService haService;

    @GetMapping("/admin/add")
    public ModelAndView add_html(){
        Date date = new Date();
        String year=String.format("%tY", date);
        String mon=String .format("%tm", date);
        String day=String .format("%td", date);
        BaseContract baseContract = baseContractService.getLastContract();
        int uuid = 0;
        if(baseContract==null){
            uuid=1;
        }
        else {
            uuid = baseContract.getId()+1;
        }
        List<HA> listA = haService.queryAll();
        List<HB> listB = hbService.queryAll();
        String contract_name = "P"+year+mon+day+uuid;
        ModelAndView mv = new ModelAndView();
        mv.addObject("cont_name",contract_name);
        mv.addObject("listA",listA);
        mv.addObject("listB",listB);
        mv.setViewName("page/table/add");
        return mv;
    }

    @GetMapping("/admin/edit_1")
    public ModelAndView edit_1(){
        ModelAndView mv = new ModelAndView();
        List<HA> listA = haService.queryAll();
        List<HB> listB = hbService.queryAll();
        mv.setViewName("page/table/edit1.html");
        mv.addObject("listB",listB);
        mv.addObject("listA",listA);
        return mv;

    }

    @GetMapping("/admin/edit")
    public ModelAndView edit(){
        ModelAndView mv = new ModelAndView();
        List<HA> listA = haService.queryAll();
        List<HB> listB = hbService.queryAll();
        mv.setViewName("page/table/edit.html");
        mv.addObject("listB",listB);
        mv.addObject("listA",listA);
        return mv;

    }

    @GetMapping("/admin/edit_2")
    public ModelAndView edit_2(){
        ModelAndView mv = new ModelAndView();
        List<HA> listA = haService.queryAll();
        List<HB> listB = hbService.queryAll();
        mv.setViewName("page/table/edit2.html");
        mv.addObject("listB",listB);
        mv.addObject("listA",listA);
        return mv;

    }

    @GetMapping("/admin/del_a/{id}")
    @ResponseBody
    public String del_a(@PathVariable("id") Integer id){
        haService.deleteById(id);
        return "删除成功";

    }

    @GetMapping("/admin/del_b/{id}")
    @ResponseBody
    public String del_b(@PathVariable("id") Integer id){
        hbService.deleteById(id);
        return "删除成功";

    }
}

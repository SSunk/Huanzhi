package com.suzhou.huanzhi.controller;

import com.suzhou.huanzhi.entity.*;
import com.suzhou.huanzhi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;

@Controller
public class DataController {
    @Autowired
    CaiwuService caiwuService;

    @Autowired
    BaseContractService baseContractService;

    @Autowired
    UserService userService;

    @Autowired
    ResultService resultService;

    @Autowired
    SupportService supportService;


    @ResponseBody
    @GetMapping("/admin/get_caiwu")
    public HashMap get_contract(){
        HashMap data = new HashMap();
        List<All_Info> caiwulist = caiwuService.queryAll();
        if (caiwulist.size()!=0){
            data.put("code",0);
            data.put("msg","");
            data.put("count",caiwulist.size());
            data.put("data",caiwulist);
        }
        return data;
    }

    @ResponseBody
    @GetMapping("/admin/get_zhanzi")
    public HashMap get_zhanzi(){
        HashMap data = new HashMap();
        List<All_Info> itemlist = supportService.queryAll();
        if (itemlist.size()!=0){
            data.put("code",0);
            data.put("msg","");
            data.put("count",itemlist.size());
            data.put("data",itemlist);
        }
        return data;
    }

    @ResponseBody
    @GetMapping("/admin/get_zhikong")
    public HashMap get_zhikong(){
        HashMap data = new HashMap();
        List<All_Info> itemlist = resultService.queryAll();
        if (itemlist.size()!=0){
            data.put("code",0);
            data.put("msg","");
            data.put("count",itemlist.size());
            data.put("data",itemlist);
        }
        return data;
    }

    @PostMapping("/admin/post_data")
    @ResponseBody
    public String post_data(All_Info testItem){
        BaseContract bc = new BaseContract();
        bc.setId(testItem.getId());
        bc.setContractCost(testItem.getContractCost());
        bc.setContractNum(testItem.getContractNum());
        bc.setFollowName(testItem.getFollowName());
        bc.setItem(testItem.getItem());
        bc.setOldOrNew(testItem.getOldOrNew());
        bc.setPartA(testItem.getPartA());
        bc.setPartB(testItem.getPartB());
        bc.setOrderName(testItem.getOrderName());


        Caiwu caiwu = new Caiwu();
        caiwu.setAlreadyOpen1(testItem.getAlreadyOpen1());
        caiwu.setAlreadyOpen2(testItem.getAlreadyOpen2());
        caiwu.setAlreadyOpen3(testItem.getAlreadyOpen3());
        caiwu.setCheckPay(testItem.getCheckPay());
        caiwu.setGetMon1(testItem.getGetMon1());
        caiwu.setGetMon2(testItem.getGetMon2());
        caiwu.setGetMon3(testItem.getGetMon3());
        caiwu.setHelpMoney(testItem.getHelpMoney());
        caiwu.setNotGet(testItem.getNotGet());
        caiwu.setHelpPay(testItem.getHelpPay());
        caiwu.setProfessCost(testItem.getProfessCost());
        caiwu.setContractNum(testItem.getContractNum());
        caiwu.setNotOpen(testItem.getNotOpen());
        caiwu.setHelpTicket(testItem.getHelpTicket());
        caiwu.setId(testItem.getId());

        Support support = new Support();
        support.setHelpComp(testItem.getHelpComp());
        support.setId(testItem.getId());
        support.setCloseTime(testItem.getCloseTime());

        BaseContract testItem1 = baseContractService.update(bc);
        Caiwu cw = caiwuService.update(caiwu);
        Support sp = supportService.update(support);

        if(testItem1!=null&&cw!=null&&sp!=null) {
            return "更新成功";
        }
        else {
            return "更新失败";
        }
    }

    @PostMapping("/admin/post_zz")
    @ResponseBody
    public String post_zz(All_Info testItem){

        BaseContract bc = new BaseContract();
        bc.setId(testItem.getId());
        bc.setContractCost(testItem.getContractCost());
        bc.setContractNum(testItem.getContractNum());
        bc.setFollowName(testItem.getFollowName());
        bc.setItem(testItem.getItem());
        bc.setOldOrNew(testItem.getOldOrNew());
        bc.setPartA(testItem.getPartA());
        bc.setPartB(testItem.getPartB());
        bc.setOrderName(testItem.getOrderName());


        Support zz = new Support();
        System.out.println(testItem.getCalXiaohua());
        zz.setBodyCheckTime(testItem.getBodyCheckTime());
        zz.setCloseTime(testItem.getCloseTime());
        zz.setNeedTime(testItem.getNeedTime());
        zz.setBodyType(testItem.getBodyType());
        zz.setCalXiaohua(testItem.getCalXiaohua());
        zz.setGetDate(testItem.getGetDate());
        zz.setPersonNum(testItem.getPersonNum());
        zz.setHelpComp(testItem.getHelpComp());
        zz.setId(testItem.getId());

        Caiwu caiwu = new Caiwu();
        caiwu.setAlreadyOpen1(testItem.getAlreadyOpen1());
        caiwu.setNotOpen(testItem.getNotOpen());
        caiwu.setNotGet(testItem.getNotGet());
        caiwu.setGetMon1(testItem.getGetMon1());
        caiwu.setId(testItem.getId());


        BaseContract result = baseContractService.update(bc);
        Support testItem1 = supportService.update(zz);
        Caiwu res = caiwuService.update(caiwu);
        if(testItem1!=null&&result!=null&&res!=null) {
            return "更新成功";
        }
        else {
            return "更新失败";
        }
    }

    @PostMapping("/admin/post_zk")
    @ResponseBody
    public String post_zk(All_Info testItem){

        BaseContract bc = new BaseContract();
        bc.setId(testItem.getId());
        bc.setContractCost(testItem.getContractCost());
        bc.setContractNum(testItem.getContractNum());
        bc.setFollowName(testItem.getFollowName());
        bc.setItem(testItem.getItem());
        bc.setOldOrNew(testItem.getOldOrNew());
        bc.setPartA(testItem.getPartA());
        bc.setPartB(testItem.getPartB());
        bc.setOrderName(testItem.getOrderName());

        Support support = new Support();
        support.setHelpComp(testItem.getHelpComp());
        support.setId(testItem.getId());
        support.setCloseTime(testItem.getCloseTime());
        support.setCalXiaohua(testItem.getCalXiaohua());
        support.setGetDate(testItem.getGetDate());
        support.setNeedTime(testItem.getNeedTime());
        support.setBodyCheckTime(testItem.getBodyCheckTime());
        support.setBodyType(testItem.getBodyType());
        support.setPersonNum(testItem.getPersonNum());

        Caiwu cw = new Caiwu();
        cw.setHelpMoney(testItem.getHelpMoney());
        cw.setId(testItem.getId());

        Result rs = new Result();
        rs.setBodyCheck(testItem.getBodyCheck());
        rs.setCheckTime(testItem.getCheckTime());
        rs.setComment(testItem.getComment());
        rs.setService(testItem.getService());
        rs.setId(testItem.getId());

        baseContractService.update(bc);
        caiwuService.update(cw);
        supportService.update(support);
        resultService.update(rs);
        if(bc!=null&&cw!=null&&support!=null&&rs!=null) {
            return "更新成功";
        }
        else {
            return "更新失败";
        }
    }
//
    @PostMapping("/admin/inser_data")
    @ResponseBody
    public String insert_data(All_Info testItem){

        System.out.println(testItem.getContractNum());
        BaseContract bc = new BaseContract();
        bc.setContractCost(testItem.getContractCost());
        bc.setContractNum(testItem.getContractNum());
        bc.setFollowName(testItem.getFollowName());
        bc.setItem(testItem.getItem());
        bc.setOldOrNew(testItem.getOldOrNew());
        bc.setPartA(testItem.getPartA());
        bc.setPartB(testItem.getPartB());
        bc.setOrderName(testItem.getOrderName());

        Support support = new Support();
        support.setHelpComp(testItem.getHelpComp());
        support.setCloseTime(testItem.getCloseTime());
        support.setCalXiaohua(testItem.getCalXiaohua());
        support.setGetDate(testItem.getGetDate());
        support.setNeedTime(testItem.getNeedTime());
        support.setBodyCheckTime(testItem.getBodyCheckTime());
        support.setBodyType(testItem.getBodyType());
        support.setPersonNum(testItem.getPersonNum());
        support.setContractNum(testItem.getContractNum());

        Caiwu caiwu = new Caiwu();
        caiwu.setAlreadyOpen1(testItem.getAlreadyOpen1());
        caiwu.setAlreadyOpen2(testItem.getAlreadyOpen2());
        caiwu.setAlreadyOpen3(testItem.getAlreadyOpen3());
        caiwu.setCheckPay(testItem.getCheckPay());
        caiwu.setGetMon1(testItem.getGetMon1());
        caiwu.setGetMon2(testItem.getGetMon2());
        caiwu.setGetMon3(testItem.getGetMon3());
        caiwu.setHelpMoney(testItem.getHelpMoney());
        caiwu.setNotGet(testItem.getNotGet());
        caiwu.setHelpPay(testItem.getHelpPay());
        caiwu.setProfessCost(testItem.getProfessCost());
        caiwu.setContractNum(testItem.getContractNum());
        caiwu.setNotOpen(testItem.getNotOpen());
        caiwu.setHelpTicket(testItem.getHelpTicket());

        Result rs = new Result();
        rs.setBodyCheck(testItem.getBodyCheck());
        rs.setCheckTime(testItem.getCheckTime());
        rs.setComment(testItem.getComment());
        rs.setService(testItem.getService());
        rs.setContractNum(testItem.getContractNum());

        baseContractService.insert(bc);
        caiwuService.insert(caiwu);
        supportService.insert(support);
        resultService.insert(rs);

        if(bc!=null&&caiwu!=null&&support!=null&&rs!=null) {
            return "添加成功";
        }
        else {
            return "添加失败";
        }
    }
//
//    @PostMapping("/admin/inser_zz")
//    @ResponseBody
//    public String insert_zz(All_caiwu testItem){
//        BaseContract bc = new BaseContract();
//        bc.setId(testItem.getId());
//        bc.setContractCost(testItem.getContractCost());
//        bc.setContractNum(testItem.getContractNum());
//        bc.setFollowName(testItem.getFollowName());
//        bc.setItem(testItem.getItem());
//        bc.setOldOrNew(testItem.getOldOrNew());
//        bc.setPartA(testItem.getPartA());
//        bc.setPartB(testItem.getPartB());
//        bc.setOrderName(testItem.getOrderName());
//
//
//        TestItem caiwu = new TestItem();
//        caiwu.setAlreadyOpen1(testItem.getAlreadyOpen1());
//        caiwu.setAlreadyOpen2(testItem.getAlreadyOpen2());
//        caiwu.setAlreadyOpen3(testItem.getAlreadyOpen3());
//        caiwu.setCheckPay(testItem.getCheckPay());
//        caiwu.setCloseTime(testItem.getCloseTime());
//        caiwu.setGetMon1(testItem.getGetMon1());
//        caiwu.setGetMon2(testItem.getGetMon2());
//        caiwu.setGetMon3(testItem.getGetMon3());
//        caiwu.setHelpComp(testItem.getHelpComp());
//        caiwu.setHelpMoney(testItem.getHelpMoney());
//        caiwu.setNotGet(testItem.getNotGet());
//        caiwu.setHelpPay(testItem.getHelpPay());
//        caiwu.setProfessCost(testItem.getProfessCost());
//        caiwu.setContractNum(testItem.getContractNum());
//        caiwu.setNotOpen(testItem.getNotOpen());
//        caiwu.setHelpTicket(testItem.getHelpTicket());
//        caiwu.setId(testItem.getId());
//        BaseContract result = baseContractService.insert(bc);
//        TestItem testItem1 = testItemService.insert(caiwu);
//
//        if(testItem1!=null) {
//            return "添加成功";
//        }
//        else {
//            return "添加失败";
//        }
//    }
//
//    @PostMapping("/admin/insert_zk")
//    @ResponseBody
//    public String insert_zk(TestItemZk zk){
//        TestItemZk testItem1 = testItemZkService.insert(zk);
//        if(testItem1!=null) {
//            return "添加成功";
//        }
//        else {
//            return "添加失败";
//        }
//    }
//
    @RequestMapping("/admin/del/{id}")
    @ResponseBody
    public String del_data(@PathVariable("id") Integer id){
        baseContractService.deleteById(id);
        caiwuService.deleteById(id);
        resultService.deleteById(id);
        supportService.deleteById(id);
            return "删除成功";

    }
//
    @RequestMapping("/admin/del_zz/{id}")
    @ResponseBody
    public String del_zz(@PathVariable("id") Integer id){
        baseContractService.deleteById(id);
        caiwuService.deleteById(id);
        resultService.deleteById(id);
        supportService.deleteById(id);
        return "删除成功";

    }
//
    @RequestMapping("/admin/del_zk/{id}")
    @ResponseBody
    public String del_zk(@PathVariable("id") Integer id){
        baseContractService.deleteById(id);
        caiwuService.deleteById(id);
        resultService.deleteById(id);
        supportService.deleteById(id);
        return "删除成功";

    }
}

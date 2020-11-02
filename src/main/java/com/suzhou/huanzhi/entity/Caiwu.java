package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (Caiwu)实体类
 *
 * @author makejava
 * @since 2020-09-23 19:49:54
 */
public class Caiwu implements Serializable {
    private static final long serialVersionUID = -43326868859664373L;

    private Integer id;

    private String contractNum;

    private String alreadyOpen1;

    private String alreadyOpen2;

    private String alreadyOpen3;

    private String notOpen;

    private String getMon1;

    private String getMon2;

    private String getMon3;

    private String notGet;

    private String helpMoney;

    private String helpTicket;

    private String helpPay;

    private String checkPay;

    private String professCost;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public String getAlreadyOpen1() {
        return alreadyOpen1;
    }

    public void setAlreadyOpen1(String alreadyOpen1) {
        this.alreadyOpen1 = alreadyOpen1;
    }

    public String getAlreadyOpen2() {
        return alreadyOpen2;
    }

    public void setAlreadyOpen2(String alreadyOpen2) {
        this.alreadyOpen2 = alreadyOpen2;
    }

    public String getAlreadyOpen3() {
        return alreadyOpen3;
    }

    public void setAlreadyOpen3(String alreadyOpen3) {
        this.alreadyOpen3 = alreadyOpen3;
    }

    public String getNotOpen() {
        return notOpen;
    }

    public void setNotOpen(String notOpen) {
        this.notOpen = notOpen;
    }

    public String getGetMon1() {
        return getMon1;
    }

    public void setGetMon1(String getMon1) {
        this.getMon1 = getMon1;
    }

    public String getGetMon2() {
        return getMon2;
    }

    public void setGetMon2(String getMon2) {
        this.getMon2 = getMon2;
    }

    public String getGetMon3() {
        return getMon3;
    }

    public void setGetMon3(String getMon3) {
        this.getMon3 = getMon3;
    }

    public String getNotGet() {
        return notGet;
    }

    public void setNotGet(String notGet) {
        this.notGet = notGet;
    }

    public String getHelpMoney() {
        return helpMoney;
    }

    public void setHelpMoney(String helpMoney) {
        this.helpMoney = helpMoney;
    }

    public String getHelpTicket() {
        return helpTicket;
    }

    public void setHelpTicket(String helpTicket) {
        this.helpTicket = helpTicket;
    }

    public String getHelpPay() {
        return helpPay;
    }

    public void setHelpPay(String helpPay) {
        this.helpPay = helpPay;
    }

    public String getCheckPay() {
        return checkPay;
    }

    public void setCheckPay(String checkPay) {
        this.checkPay = checkPay;
    }

    public String getProfessCost() {
        return professCost;
    }

    public void setProfessCost(String professCost) {
        this.professCost = professCost;
    }

}
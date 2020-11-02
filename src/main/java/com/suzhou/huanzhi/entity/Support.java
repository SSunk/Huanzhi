package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (Support)实体类
 *
 * @author makejava
 * @since 2020-09-23 19:50:21
 */
public class Support implements Serializable {
    private static final long serialVersionUID = -26803699197593486L;

    private Integer id;

    private String contractNum;

    private String helpComp;

    private String needTime;

    private String closeTime;

    private String calXiaohua;

    private String getDate;

    private String yujiCaiyang;

    private String prospTime;

    private String bodyCheckTime;

    private String bodyType;

    private String personNum;


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

    public String getHelpComp() {
        return helpComp;
    }

    public void setHelpComp(String helpComp) {
        this.helpComp = helpComp;
    }

    public String getNeedTime() {
        return needTime;
    }

    public void setNeedTime(String needTime) {
        this.needTime = needTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getCalXiaohua() {
        return calXiaohua;
    }

    public void setCalXiaohua(String calXiaohua) {
        this.calXiaohua = calXiaohua;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public String getYujiCaiyang() {
        return yujiCaiyang;
    }

    public void setYujiCaiyang(String yujiCaiyang) {
        this.yujiCaiyang = yujiCaiyang;
    }

    public String getProspTime() {
        return prospTime;
    }

    public void setProspTime(String prospTime) {
        this.prospTime = prospTime;
    }

    public String getBodyCheckTime() {
        return bodyCheckTime;
    }

    public void setBodyCheckTime(String bodyCheckTime) {
        this.bodyCheckTime = bodyCheckTime;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getPersonNum() {
        return personNum;
    }

    public void setPersonNum(String personNum) {
        this.personNum = personNum;
    }

}
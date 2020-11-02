package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (Result)实体类
 *
 * @author makejava
 * @since 2020-09-23 19:50:08
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 528695224062465171L;

    private Integer id;

    private String contractNum;

    private String checkTime;

    private String bodyCheck;

    private String comment;

    private String service;


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

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getBodyCheck() {
        return bodyCheck;
    }

    public void setBodyCheck(String bodyCheck) {
        this.bodyCheck = bodyCheck;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

}
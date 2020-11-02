package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (BaseContract)实体类
 *
 * @author makejava
 * @since 2020-09-23 19:49:33
 */
public class BaseContract implements Serializable {
    private static final long serialVersionUID = 122409257502332911L;

    private Integer id;

    private String contractNum;

    private String partA;

    private String partB;

    private String oldOrNew;

    private String item;

    private String orderName;

    private String followName;

    private String contractCost;



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

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getOldOrNew() {
        return oldOrNew;
    }

    public void setOldOrNew(String oldOrNew) {
        this.oldOrNew = oldOrNew;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getFollowName() {
        return followName;
    }

    public void setFollowName(String followName) {
        this.followName = followName;
    }

    public String getContractCost() {
        return contractCost;
    }

    public void setContractCost(String contractCost) {
        this.contractCost = contractCost;
    }

}
package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (Manage)实体类
 *
 * @author makejava
 * @since 2020-09-23 23:46:28
 */
public class Manage implements Serializable {
    private static final long serialVersionUID = 614646674189867605L;

    private Integer id;

    private String manageName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

}
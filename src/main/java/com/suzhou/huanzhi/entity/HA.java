package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (HA)实体类
 *
 * @author makejava
 * @since 2020-11-01 14:13:42
 */
public class HA implements Serializable {
    private static final long serialVersionUID = 291171929267243293L;

    private Integer id;

    private String helpA;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHelpA() {
        return helpA;
    }

    public void setHelpA(String helpA) {
        this.helpA = helpA;
    }

}
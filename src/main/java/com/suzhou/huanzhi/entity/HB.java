package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (HB)实体类
 *
 * @author makejava
 * @since 2020-11-01 14:14:01
 */
public class HB implements Serializable {
    private static final long serialVersionUID = 467647696491943712L;

    private Integer id;

    private String helpB;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHelpB() {
        return helpB;
    }

    public void setHelpB(String helpB) {
        this.helpB = helpB;
    }

}
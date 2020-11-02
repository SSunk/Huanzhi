package com.suzhou.huanzhi.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-09-19 15:48:22
 */
public class User implements Serializable {
    private static final long serialVersionUID = 446018151471676880L;

    private Integer id;

    private String manageName;

    private String email;

    private String password;

    private String roleee;

    private String roleee2;

    public String getRoleee2() {
        return roleee2;
    }

    public void setRoleee2(String roleee2) {
        this.roleee2 = roleee2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleee() {
        return roleee;
    }

    public void setRoleee(String roleee) {
        this.roleee = roleee;
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName;
    }
}
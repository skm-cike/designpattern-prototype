package com.skm.study.desginpattern.prototype.simple;

import java.util.List;

public class User implements Cloneable {
    private String userName;
    private List<String> roles;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

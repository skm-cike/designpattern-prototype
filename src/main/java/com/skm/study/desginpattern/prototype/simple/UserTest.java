package com.skm.study.desginpattern.prototype.simple;


import java.util.ArrayList;

/**
* @描述: 浅 克隆
* @作者: 陆华
* @日期: 16:35 2019-04-03 0003
* @修改人:
**/
public class UserTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setUserName("skm");
        user.setRoles(new ArrayList<String>());

        User user2 = (User) user.clone();
        System.out.println(user2 == user);
        System.out.println(user.getRoles() == user2.getRoles());
    }
}
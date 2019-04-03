package com.skm.study.desginpattern.prototype.deep;

import java.io.IOException;
import java.util.ArrayList;


/**
* @描述: 深度克隆测试 反序列化实现深度克隆
* @作者: 陆华
* @日期: 16:34 2019-04-03 0003
* @修改人:
**/
public class User2Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User2 user = new User2();
        user.setUserName("skm");
        user.setRoles(new ArrayList<String>());

        User2 user2 = user.deepClone();

        System.out.println(user == user2);
        System.out.println(user.getRoles() == user2.getRoles());
    }
}

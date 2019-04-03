package com.skm.study.desginpattern.prototype.deep;

import java.io.*;
import java.util.List;

public class User2 implements Serializable {
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

    public User2 deepClone() throws IOException, ClassNotFoundException {
        User2 user2 = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(byteArrayOutputStream);
            os.writeObject(this);
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteArrayInputStream);
            user2 = (User2)in.readObject();
        } finally {
            if (null != byteArrayOutputStream) {
                byteArrayOutputStream.close();
            }
            if (null != byteArrayInputStream) {
                byteArrayInputStream.close();
            }
        }
        return user2;
    }
}

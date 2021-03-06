package com.imooc.user.dto;

import java.io.Serializable;

/**
 * @author ShaoTian
 * @date 2020/5/21 15:22
 */
public class UserDto implements Serializable {

    private int id;

    private String username;

    private String password;

    private String email;

    private String realName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}

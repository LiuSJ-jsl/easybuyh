package com.htkj.easybuy.entity;

/**
 * @Description: 登录的实体类
 * @Author: LiuSJ
 * @date: 2019/10/18 11:58
 */
public class User {
    int id;
    String userName;
    String password;
    int sex;
    String email;
    String mobile;
    int type;
    String vcode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    @Override
    public String toString() {
        return "LoginUser{" + "id=" + id + ", userName='" + userName + '\'' + ", password='" + password + '\''
            + ", sex=" + sex + ", email='" + email + '\'' + ", mobile='" + mobile + '\'' + ", type=" + type
            + ", vcode='" + vcode + '\'' + '}' + "\n";
    }
}

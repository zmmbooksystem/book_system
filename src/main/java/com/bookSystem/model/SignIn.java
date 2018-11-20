package com.bookSystem.model;

/**
 * Create with IntelliJ IDEA
 * Author:zengmeng
 * Date:2018/11/17 0017
 * Time:下午 16:24
 */
public class SignIn {
    private String PHONE;
    private String PASSWORD;

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    @Override
    public String toString() {
        return "SignIn{" +
                "PHONE='" + PHONE + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                '}';
    }
}

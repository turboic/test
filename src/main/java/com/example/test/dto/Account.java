package com.example.test.dto;

public class Account {
    /**
     * 账号Id
     */
    private String id;
    /**
     *账号名
     */

    private String accountName;
    /**
     *账号密码
     */

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

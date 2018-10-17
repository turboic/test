package com.example.test.dto;

public class App {
    /**
     *应用id
     */
    private String id;
    /**
     *应用名称
     */
    private String appName;
    /**
     *公司
     */

    private String company;
    /**
     *账号Id
     */
    private String accountId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

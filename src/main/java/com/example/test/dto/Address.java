package com.example.test.dto;

public class Address {
    /**
     *地址Id
     */
    private String id;

    /**
     *地址名称
     */
    private String name;
    /**
     *地址详细
     */
    private String detail;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

package com.example.test.dto;

public class Order {
    /**
     *订单Id
     */
    private String id;

    /**
     *订单编号
     */
    private String orderNumber;

    /**
     *订单详情
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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}

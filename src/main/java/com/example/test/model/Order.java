package com.example.test.model;

import java.io.Serializable;
import java.util.List;

/**
 * order
 * @author 
 */
public class Order implements Serializable {
    private String id;

    private String number;

    private String name;

    private List<OrderDetail> orderDetailList;

    private List<Address> addresslList;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public List<Address> getAddresslList() {
        return addresslList;
    }

    public void setAddresslList(List<Address> addresslList) {
        this.addresslList = addresslList;
    }
}
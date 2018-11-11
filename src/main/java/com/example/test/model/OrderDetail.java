package com.example.test.model;

import java.io.Serializable;

/**
 * order
 * @author 
 */
public class OrderDetail implements Serializable {

    private String id;

    private String content;
    private String orderid;
    private String price;

    private Order order;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getOrderid() {
        return orderid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", price='" + price + '\'' +
                ", orderid='" + orderid + '\'' +
                '}';
    }
}
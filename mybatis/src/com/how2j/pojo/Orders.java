package com.how2j.pojo;

import java.util.List;

public class Orders {
	private int id;
    private String code;
     
    List<OrdersItem> ordersItems;
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public List<OrdersItem> getOrderItems() {
        return ordersItems;
    }
    public void setOrderItems(List<OrdersItem> orderItems) {
        this.ordersItems = orderItems;
    }
}

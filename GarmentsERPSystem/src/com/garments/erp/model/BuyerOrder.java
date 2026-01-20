package com.garments.erp.model;

import java.util.Date;

/**
 *
 * @author TASRIF ZAMAN
 */
public class BuyerOrder {
    private int orderId;
    private String buyerName;
    private String productName;
    private int quantity;  
    private Date orderDate;

    public BuyerOrder() {
        
    }

    public BuyerOrder(int orderId, String buyerName, String productName, int quantity, Date orderDate) {
        this.orderId = orderId;
        this.buyerName = buyerName;
        this.productName = productName;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
}

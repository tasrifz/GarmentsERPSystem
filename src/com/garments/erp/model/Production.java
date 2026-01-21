package com.garments.erp.model;

/**
 *
 * @author TASRIF ZAMAN
 */
public class Production {
    private int productionId;
    private int orderId;
    private int productionQuantity;
    private String status;

    public Production() {
        
    }

    public Production(int productionId, int orderId, int productionQuantity, String status) {
        this.productionId = productionId;
        this.orderId = orderId;
        this.productionQuantity = productionQuantity;
        this.status = status;
    }
    
    
    public int getProductionId() {
        return productionId;
    }

    public void setProductionId(int productionId) {
        this.productionId = productionId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductionQuantity() {
        return productionQuantity;
    }

    public void setProductionQuantity(int productionQuantity) {
        this.productionQuantity = productionQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
}

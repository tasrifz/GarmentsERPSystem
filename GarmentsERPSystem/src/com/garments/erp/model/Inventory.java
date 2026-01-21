package com.garments.erp.model;

/**
 *
 * @author TASRIF ZAMAN
 */
public class Inventory {
   private int iteamId;
   private String iteamName;
   private int quantity;
   private String type;

    public Inventory() {
    }

    public Inventory(int iteamId, String iteamName, int quantity, String type) {
        this.iteamId = iteamId;
        this.iteamName = iteamName;
        this.quantity = quantity;
        this.type = type;
    }

    public int getIteamId() {
        return iteamId;
    }

    public void setIteamId(int iteamId) {
        this.iteamId = iteamId;
    }

    public String getIteamName() {
        return iteamName;
    }

    public void setIteamName(String iteamName) {
        this.iteamName = iteamName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   
}

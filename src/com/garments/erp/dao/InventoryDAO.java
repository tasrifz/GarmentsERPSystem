package com.garments.erp.dao;

import com.garments.erp.model.Inventory;
import com.garments.erp.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TASRIF ZAMAN
 */
public class InventoryDAO {
    public void addInventory(Inventory item){
        try {
            Connection con = DBConnection.getConnection();
             String sql = "INSERT INTO inventory Values (?,?,?,?)";
              PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1, item.getIteamId());
                ps.setString(2, item.getIteamName());
                 ps.setInt(3, item.getQuantity());
                  ps.setString(4, item.getType());
                   ps.executeUpdate();
                   
            System.out.println("Inventory Updated");
        } catch (Exception e) {
        }  
    }
    public void viewInventory(){
        try {
            Connection con = DBConnection.getConnection();
             String sql = "SELECT * FROM inventory";
              PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
                System.out.println("ItemID | IteamName | Qty | Type");
                  while (rs.next()) { 
                      System.out.println(rs.getInt(1) + " | "+rs.getString(2) + " | "+rs.getInt(3) + " | "+rs.getString(4) + " | ");          
            }
        }catch (Exception e) {
            e.printStackTrace();
    }
  }
}

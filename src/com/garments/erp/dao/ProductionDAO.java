package com.garments.erp.dao;

import com.garments.erp.model.Production;
import com.garments.erp.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TASRIF ZAMAN
 */
public class ProductionDAO {
    public void startProduction(Production p){
        try {
            Connection con = DBConnection.getConnection();
             String sql = "INSERT INTO production Values(?,?,?,?)";
              PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1, p.getProductionId());
                ps.setInt(2, p.getOrderId());
                 ps.setInt(3, p.getProductionQuantity());
                  ps.setString(4, p.getStatus());
                   ps.executeUpdate();
            
            System.out.println("Production started");
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void viewProduction(){
        try {
            Connection con = DBConnection.getConnection();
             String sql = "SELECT * FROM production";
              PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               System.out.println("ProductionID | OrderID | Qty | Status");
                  while (rs.next()) {                
                      System.out.println(rs.getInt(1) + " | " +rs.getInt(2) + " | " +rs.getInt(3) + " | " +rs.getString(4) + " | " );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

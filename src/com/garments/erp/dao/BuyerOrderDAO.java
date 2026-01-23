package com.garments.erp.dao;

import com.garments.erp.model.BuyerOrder;
import com.garments.erp.util.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author TASRIF ZAMAN
 */
public class BuyerOrderDAO {
    public void addOrder(BuyerOrder order){
        try {
            Connection con = DBConnection.getConnection();
             String sql = "INSERT INTO buyer_order Values (?,?,?,?,?)";
              PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1, order.getOrderId());
                ps.setString(2, order.getBuyerName());
                 ps.setString(3, order.getProductName());
                  ps.setInt(4, order.getQuantity());
                   ps.setDate(5, (Date) order.getOrderDate());
                    ps.executeQuery();
                    
                System.out.println("Buyer order saved");
             
        } catch (Exception e) {
        }
    }
}

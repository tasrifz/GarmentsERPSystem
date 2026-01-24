package com.garments.erp.dao;

import com.garments.erp.model.Production;
import com.garments.erp.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductionDAO {
      // ::::::::::::::: production save :::::::::::::::
    public boolean save(Production p) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO production VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getProductionId());
            ps.setInt(2, p.getOrderId());
            ps.setInt(3, p.getProductionQuantity());
            ps.setString(4, p.getStatus());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Production p) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE production SET order_id=?, production_quantity=?, status=? WHERE production_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getOrderId());
            ps.setInt(2, p.getProductionQuantity());
            ps.setString(3, p.getStatus());
            ps.setInt(4, p.getProductionId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
     // ::::::::::::::: production Delete :::::::::::::::
    public boolean delete(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM production WHERE production_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
}

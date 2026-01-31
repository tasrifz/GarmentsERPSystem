package com.garments.erp.dao;

import com.garments.erp.model.Production;
import com.garments.erp.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductionDAO {

    public boolean save(Production p) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO production (production_id, order_id, qty, status) VALUES (?,?,?,?)";
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
            String sql = "UPDATE production SET order_id=?, qty=?, status=? WHERE production_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getOrderId());
            ps.setInt(2, p.getProductionQuantity());
            ps.setString(3, p.getStatus());
            ps.setInt(4, p.getProductionId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM production WHERE production_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Production getById(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM production WHERE production_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Production p = new Production();
                p.setProductionId(rs.getInt("production_id"));
                p.setOrderId(rs.getInt("order_id"));
                p.setProductionQuantity(rs.getInt("production_quantity"));
                p.setStatus(rs.getString("status"));
                return p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Production> getAll() {
        List<Production> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM production";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Production p = new Production();
                p.setProductionId(rs.getInt("production_id"));
                p.setOrderId(rs.getInt("order_id"));
                p.setProductionQuantity(rs.getInt("qty"));
                p.setStatus(rs.getString("status"));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

package com.garments.erp.dao;

import com.garments.erp.model.Inventory;
import com.garments.erp.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryDAO {

    // Save
    public boolean save(Inventory i) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO inventory(item_id, item_name, quantity, type) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getIteamId());
            ps.setString(2, i.getIteamName());
            ps.setInt(3, i.getQuantity());
            ps.setString(4, i.getType());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    // Update (BY ID)
    public boolean update(Inventory i) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE inventory SET item_name=?, quantity=?, type=? WHERE item_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, i.getIteamName());
            ps.setInt(2, i.getQuantity());
            ps.setString(3, i.getType());
            ps.setInt(4, i.getIteamId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    // Delete
    public boolean delete(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM inventory WHERE item_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    
    public List<Inventory> getAll() {
        List<Inventory> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM inventory");
            while (rs.next()) {
                Inventory i = new Inventory();
                i.setIteamId(rs.getInt("item_id"));
                i.setIteamName(rs.getString("item_name"));
                i.setQuantity(rs.getInt("quantity"));
                i.setType(rs.getString("type"));
                list.add(i);
            }
        } catch (Exception e) {}
        return list;
    }

    
    public Inventory searchInventoryById(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM inventory WHERE item_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Inventory i = new Inventory();
                i.setIteamId(rs.getInt("item_id"));
                i.setIteamName(rs.getString("item_name"));
                i.setQuantity(rs.getInt("quantity"));
                i.setType(rs.getString("type"));
                return i;
            }
        } catch (Exception e) {}
        return null;
    }
}



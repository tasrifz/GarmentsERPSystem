package com.garments.erp.dao;

import com.garments.erp.model.Inventory;
import com.garments.erp.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InventoryDAO {
  // ::::::::::::::: Save Inventory::::::::::::::
    public boolean save(Inventory i) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO inventory VALUES (?,?,?,?)";
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
    // ::::::::::::::: Update Inventory::::::::::::::
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
    // // ::::::::::::::: Delete Inventory::::::::::::::
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
}


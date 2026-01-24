package com.garments.erp.dao;

import com.garments.erp.model.User;
import com.garments.erp.util.DBConnection;
import java.sql.*;

public class UserDAO {

    public boolean addUser(User user) {
        String sql = "INSERT INTO users(user_name, password) VALUES(?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());

            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean login(String username, String password) {
        String sql = "SELECT * FROM users WHERE user_name=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}


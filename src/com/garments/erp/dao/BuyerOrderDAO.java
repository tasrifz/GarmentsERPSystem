package com.garments.erp.dao;

import com.garments.erp.model.BuyerOrder;
import com.garments.erp.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuyerOrderDAO {
     // ::::::::::::::::::: Insert Order::::::::::::::
    public boolean addOrder(BuyerOrder order) {
        String sql = "INSERT INTO buyer_order(order_id,buyer_name, product_name, quantity, order_date) VALUES (?, ?, ?, ?,?)";
        try (Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, order.getOrderId());
            ps.setString(2, order.getBuyerName());
            ps.setString(3, order.getProductName());
            ps.setInt(4, order.getQuantity());
            ps.setDate(5, new java.sql.Date(order.getOrderDate().getTime()));
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     // ::::::::::::::::::: Update Order::::::::::::::
    public boolean updateOrder(BuyerOrder order) {
        String sql = "UPDATE buyer_order SET buyer_name=?, product_name=?, quantity=?, order_date=? WHERE order_id=?";
        try (Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, order.getOrderId());
            ps.setString(2, order.getBuyerName());
            ps.setString(3, order.getProductName());
            ps.setInt(4, order.getQuantity());
            ps.setDate(5, new java.sql.Date(order.getOrderDate().getTime()));
            ps.setInt(5, order.getOrderId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     // ::::::::::::::::::: Delete Order::::::::::::::
    public boolean deleteOrder(int orderId) {
        String sql = "DELETE FROM buyer_order WHERE order_id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, orderId);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<BuyerOrder> getAllOrders() {
        List<BuyerOrder> list = new ArrayList<>();
        String sql = "SELECT * FROM buyer_order";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                BuyerOrder order = new BuyerOrder();
                order.setOrderId(rs.getInt("order_id"));
                order.setBuyerName(rs.getString("buyer_name"));
                order.setProductName(rs.getString("product_name"));
                order.setQuantity(rs.getInt("quantity"));
                order.setOrderDate(rs.getDate("order_date"));
                list.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

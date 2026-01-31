package com.garments.erp.dao;

import com.garments.erp.model.BuyerOrder;
import com.garments.erp.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuyerOrderDAO {

    public boolean addOrder(BuyerOrder order) {
        String sql = "INSERT INTO buyer_order (order_id, buyer_name, product_name, quantity, order_date) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, order.getOrderId());
            pst.setString(2, order.getBuyerName());
            pst.setString(3, order.getProductName());
            pst.setInt(4, order.getQuantity());
            pst.setDate(5, new java.sql.Date(order.getOrderDate().getTime()));

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateOrder(BuyerOrder order) {
        String sql = "UPDATE buyer_order SET buyer_name=?, product_name=?, quantity=?, order_date=? WHERE order_id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, order.getBuyerName());
            pst.setString(2, order.getProductName());
            pst.setInt(3, order.getQuantity());
            pst.setDate(4, new java.sql.Date(order.getOrderDate().getTime()));
            pst.setInt(5, order.getOrderId());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteOrder(int orderId) {
        String sql = "DELETE FROM buyer_order WHERE order_id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, orderId);
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<BuyerOrder> getAllOrders() {
        List<BuyerOrder> list = new ArrayList<>();
        String sql = "SELECT * FROM buyer_order";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                BuyerOrder o = new BuyerOrder();
                o.setOrderId(rs.getInt("order_id"));
                o.setBuyerName(rs.getString("buyer_name"));
                o.setProductName(rs.getString("product_name"));
                o.setQuantity(rs.getInt("quantity"));
                o.setOrderDate(rs.getDate("order_date"));
                list.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}


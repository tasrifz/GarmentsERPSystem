package com.garments.erp.service;

import com.garments.erp.dao.BuyerOrderDAO;
import com.garments.erp.model.BuyerOrder;
import java.util.List;

public class BuyerOrderService {
    private BuyerOrderDAO dao = new BuyerOrderDAO();

    public boolean addOrder(BuyerOrder order) {
        if (order.getQuantity() <= 0) return false;
        return dao.addOrder(order);
    }

    public boolean updateOrder(BuyerOrder order) {
        if (order.getQuantity() <= 0) return false;
        return dao.updateOrder(order);
    }

    public boolean deleteOrder(int orderId) {
        return dao.deleteOrder(orderId);
    }

    public List<BuyerOrder> getOrders() {
        return dao.getAllOrders();
    }
}


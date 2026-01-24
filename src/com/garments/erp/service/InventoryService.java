package com.garments.erp.service;

import com.garments.erp.dao.InventoryDAO;
import com.garments.erp.model.Inventory;
   
public class InventoryService {

    private InventoryDAO dao = new InventoryDAO();

    public boolean saveItem(Inventory i) {
        if (i.getQuantity() < 0) return false;
        return dao.save(i);
    }

    public boolean updateItem(Inventory i) {
        return dao.update(i);
    }

    public boolean deleteItem(int id) {
        return dao.delete(id);
    }
}


package com.garments.erp.service;

import com.garments.erp.dao.InventoryDAO;
import com.garments.erp.model.Inventory;
import java.util.List;

public class InventoryService {

    private InventoryDAO dao = new InventoryDAO();

    // Save item
    public boolean saveItem(Inventory i) {
        if(i.getQuantity() < 0) return false; 
        return dao.save(i);
    }

    // Update item
    public boolean updateItem(Inventory i) {
        return dao.update(i);
    }

    // Delete item
    public boolean deleteItem(int id) {
        return dao.delete(id);
    }

    // Get all items
    public List<Inventory> getAllInventory() {
        return dao.getAll();
    }

    // Search by ID
    public Inventory searchInventoryByID(int id) {
        return dao.searchInventoryById(id);
    }
}



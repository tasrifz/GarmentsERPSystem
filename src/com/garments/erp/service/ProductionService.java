package com.garments.erp.service;

import com.garments.erp.dao.ProductionDAO;
import com.garments.erp.model.Production;

public class ProductionService {

    private ProductionDAO dao = new ProductionDAO();

    public boolean saveProduction(Production p) {
        if (p.getProductionQuantity() <= 0) return false;
        return dao.save(p);
    }

    public boolean updateProduction(Production p) {
        return dao.update(p);
    }

    public boolean deleteProduction(int id) {
        return dao.delete(id);
    }
}


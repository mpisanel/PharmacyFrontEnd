package com.parmacya.services.impl;

import com.parmacya.model.Product;
import com.parmacya.repositories.RestAPI;
import com.parmacya.repositories.rest.RestProductAPI;
import com.parmacya.services.ProductService;

import java.util.List;

/**
 * Created by SONY on 2016-08-23.
 */
public class ProductServiceImpl implements ProductService {

    final RestAPI<Product,Long> rest = new RestProductAPI();


    @Override
    public Product findById(Long id) {
        return rest.get(id);
    }

    @Override
    public String save(Product entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Product entity) {
        return rest.put(entity);
    }

    @Override
    public String delete(Product entity) {
        return rest.delete(entity);
    }

    @Override
    public List<Product> findAll() {
        return rest.getAll();
    }
}

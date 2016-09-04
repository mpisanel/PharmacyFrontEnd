package com.parmacya.repositories;

import com.parmacya.model.Product;

import java.util.List;
/**
 * Created by SONY on 2016-08-23.
 */
public interface RestAPIaddProduct {
    public String saveProduct(Product entity);
    List<Product> getAllProducts();
    public String update(Product entity);
    Product get(Long id);
}

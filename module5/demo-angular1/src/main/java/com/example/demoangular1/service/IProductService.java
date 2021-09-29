package com.example.demoangular1.service;

import com.example.demoangular1.model.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> findAll();
    Product save(Product product);
    void delete(Product product);
    Product update(Product product);
    Product findById(long id);
}

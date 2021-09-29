package com.apidemo.service;

import com.apidemo.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    ArrayList<Product> findAll();

    Product findById(long id);

    void save(Product product);

    void delete(Product product);

    void update(Product product);
}

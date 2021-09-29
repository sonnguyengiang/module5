package com.apidemo.service;

import com.apidemo.model.Product;
import com.apidemo.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepo iProductRepo;

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) iProductRepo.findAll();
    }

    @Override
    public Product findById(long id) {
        return iProductRepo.findById(id).get();
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(Product product) {
        iProductRepo.delete(product);
    }

    @Override
    public void update(Product product) {
        iProductRepo.save(product);
    }
}

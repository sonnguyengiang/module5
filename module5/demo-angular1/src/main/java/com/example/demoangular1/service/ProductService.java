package com.example.demoangular1.service;

import com.example.demoangular1.model.Product;
import com.example.demoangular1.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepo iProductRepo;

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) iProductRepo.findAll();
    }

    @Override
    public Product save(Product product) {
        return iProductRepo.save(product);
    }

    @Override
    public void delete(Product product) {
        iProductRepo.delete(product);
    }


    @Override
    public Product update(Product product) {
        return iProductRepo.save(product);
    }

    @Override
    public Product findById(long id) {
        return iProductRepo.findById(id).get();
    }
}

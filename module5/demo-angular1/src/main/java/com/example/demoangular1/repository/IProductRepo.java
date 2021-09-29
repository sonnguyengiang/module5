package com.example.demoangular1.repository;

import com.example.demoangular1.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product, Long> {
}

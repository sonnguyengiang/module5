package com.apidemo.repository;

import com.apidemo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product, Long> {

}

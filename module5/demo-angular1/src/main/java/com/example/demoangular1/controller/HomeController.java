package com.example.demoangular1.controller;

import com.example.demoangular1.model.Product;
import com.example.demoangular1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/product")
public class HomeController {

    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public ResponseEntity<Product> findAll(){
        ArrayList<Product> products = iProductService.findAll();
        if (products.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<>(iProductService.save(product), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> showEdit(@PathVariable long id){
        return new ResponseEntity<>(iProductService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable long id, @RequestBody Product product){
        return new ResponseEntity<>(iProductService.update(product), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Product> delete(@RequestBody Product product){
        iProductService.delete(product);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}

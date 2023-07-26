package com.project.storeProductsSpringJpa.controllers;

import com.project.storeProductsSpringJpa.entities.Product;
import com.project.storeProductsSpringJpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/products")
public class ProductResource {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> prod = repository.findAll();
        return ResponseEntity.ok().body(prod);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product prod = repository.findById(id);
        return ResponseEntity.ok().body(prod);
    }

}

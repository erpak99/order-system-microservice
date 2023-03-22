package com.spring.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}

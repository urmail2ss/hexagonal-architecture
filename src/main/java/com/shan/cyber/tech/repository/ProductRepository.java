package com.shan.cyber.tech.repository;

import com.shan.cyber.tech.model.Product;

import java.util.List;

// Interface to access the product
public interface ProductRepository {

    void createProduct(Product product);

    Product getProduct(String productName);

    List<Product> getAllProduct();
}


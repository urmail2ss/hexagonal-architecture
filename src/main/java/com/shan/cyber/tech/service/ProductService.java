package com.shan.cyber.tech.service;

import com.shan.cyber.tech.model.Product;

import java.util.List;

// Interface through which the core
// application communicates. For
// all the classes implementing the
// interface, we need to implement
// the methods in this interface
public interface ProductService {


    void createProduct(Product product);

    Product getProduct(String productName);

    List<Product> listProduct();
}

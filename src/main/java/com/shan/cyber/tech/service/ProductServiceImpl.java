package com.shan.cyber.tech.service;

import com.shan.cyber.tech.model.Product;
import com.shan.cyber.tech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This is the implementation class
// for the productService
@Service
public class ProductServiceImpl
        implements ProductService {

    // Overriding the methods defined
    // in the interface
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public Product getProduct(String productName) {
        return productRepository.getProduct(productName);
    }

    @Override
    public List<Product> listProduct() {
        return productRepository.getAllProduct();
    }
}


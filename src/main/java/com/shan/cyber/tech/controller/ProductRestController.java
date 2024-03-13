package com.shan.cyber.tech.controller;

import com.shan.cyber.tech.model.Product;
import com.shan.cyber.tech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// This is the REST endpoint
@RestController
@RequestMapping("/product")
public class ProductRestController implements ProductRest {
    @Autowired
    private ProductService productService;

    @Override
    public void createProduct(Product product) {
        productService.createProduct(product);
    }

    @Override
    public Product getProduct(String productName) {
        return productService.getProduct(productName);
    }

    @Override
    public List<Product> listProduct() {
        return productService.listProduct();
    }
}

package com.shan.cyber.tech.controller;

import com.shan.cyber.tech.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductRest {
    @PostMapping
    void createProduct(@RequestBody Product product);

    @GetMapping("/{name}")
    Product getProduct(@PathVariable String name);

    @GetMapping
    List<Product> listProduct();
}

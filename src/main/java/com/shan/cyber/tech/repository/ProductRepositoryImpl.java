package com.shan.cyber.tech.repository;

import com.shan.cyber.tech.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Implementing the interface and
// all the methods which have been
// defined in the interface
@Repository
public class ProductRepositoryImpl
        implements ProductRepository {
    private final Map<String, Product> productStore
            = new HashMap<String, Product>();

    @Override
    public void createProduct(Product product) {
        productStore.put(product.getName(), product);
    }

    @Override
    public Product getProduct(String productName) {
        return productStore.get(productName);
    }

    @Override
    public List<Product> getAllProduct() {
        return productStore.values().stream().collect(Collectors.toList());
    }
}
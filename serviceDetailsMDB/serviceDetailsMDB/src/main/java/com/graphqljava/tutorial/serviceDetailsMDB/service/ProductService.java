package com.graphqljava.tutorial.serviceDetailsMDB.service;

import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Product;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.ProductRepository;

import java.util.List;
//import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public Product findProductById(Long productId) {
        return repository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
    }

    public List<Product> getProductByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    // public Optional<Product> findProductById(Long Productid) {
    //     return repository.findById(Productid);
    // }
}

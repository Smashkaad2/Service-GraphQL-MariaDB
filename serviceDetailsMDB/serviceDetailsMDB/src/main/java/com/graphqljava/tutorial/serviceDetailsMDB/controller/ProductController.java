package com.graphqljava.tutorial.serviceDetailsMDB.controller;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Product;
import com.graphqljava.tutorial.serviceDetailsMDB.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @MutationMapping
    public Product createProduct(@Argument String name, @Argument String description, @Argument Double price) {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        return service.createProduct(product);
    }

    @QueryMapping
    public Product getProductById(@Argument Long id) {
        return service.findProductById(id);
    }

    @QueryMapping
    public List<Product> getProductByName(@Argument String name) {
        return service.getProductByName(name);
    }
}

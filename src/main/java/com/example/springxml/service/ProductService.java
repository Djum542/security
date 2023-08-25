package com.example.springxml.service;

import com.example.springxml.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProduct();

    void addProduct(Product product);

    void removeProductById(long id);

    Optional<Product> getProductById(long id);

    List<Product> getAllProductsByCategoryId(int id);

    List<Product> search(String keyword);
}

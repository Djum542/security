package com.example.springxml.service;

import com.example.springxml.model.Product;
import com.example.springxml.repository.ProductReponsitoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductSer implements ProductService{
    @Autowired
    ProductReponsitoy productReponsitoy;
    @Override
    public List<Product> getAllProduct() {
        return productReponsitoy.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productReponsitoy.save(product);
    }

    @Override
    public void removeProductById(long id) {
        productReponsitoy.deleteById(id);
    }

    @Override
    public Optional<Product> getProductById(long id) {
        return productReponsitoy.findById(id);
    }

    @Override
    public List<Product> getAllProductsByCategoryId(int id) {
        return null;
    }

    @Override
    public List<Product> search(String keyword) {
        return productReponsitoy.findAll();
    }
}

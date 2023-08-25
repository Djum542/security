package com.example.springxml.repository;

import com.example.springxml.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReponsitoy extends JpaRepository<Product,Long> {
}

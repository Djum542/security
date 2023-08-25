package com.example.springxml.repository;

import com.example.springxml.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartReponsitoy extends JpaRepository<Cart, Long> {
}

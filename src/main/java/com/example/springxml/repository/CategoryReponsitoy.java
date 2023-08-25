package com.example.springxml.repository;

import com.example.springxml.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryReponsitoy extends JpaRepository<Category, Long> {
}

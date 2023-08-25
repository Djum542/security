package com.example.springxml.service;

import com.example.springxml.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAllCategory();

    void addCategory(Category category);

    void removeCategorytById(long id);

    Optional<Category> getCategoryById(long id);

    List<Category> getAllCategorysByCategoryId(int id);

    List<Category> search(String keyword);
}

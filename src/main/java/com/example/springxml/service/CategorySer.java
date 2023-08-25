package com.example.springxml.service;

import com.example.springxml.model.Category;
import com.example.springxml.repository.CategoryReponsitoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategorySer implements CategoryService{
    @Autowired
    CategoryReponsitoy categoryReponsitoy;
    @Override
    public List<Category> getAllCategory() {
        return categoryReponsitoy.findAll();
    }

    @Override
    public void addCategory(Category category) {
        categoryReponsitoy.save(category);
    }

    @Override
    public void removeCategorytById(long id) {
        categoryReponsitoy.deleteById(id);
    }

    @Override
    public Optional<Category> getCategoryById(long id) {
        return categoryReponsitoy.findById(id);
    }

    @Override
    public List<Category> getAllCategorysByCategoryId(int id) {
        return null;
    }

    @Override
    public List<Category> search(String keyword) {
        return null;
    }
}

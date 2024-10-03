package com.tortas.microservice.service.Category;

import com.tortas.microservice.model.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long Id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}

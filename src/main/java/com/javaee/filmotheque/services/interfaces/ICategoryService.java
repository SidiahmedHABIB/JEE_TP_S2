package com.javaee.filmotheque.services.interfaces;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.entities.Film;

import java.util.List;

public interface ICategoryService {
    public Category createCategory(Category c);
    public Category findCategoryById(Long id);
    public List<Category> findAllCategories();
    public Category updateCategory (Category c);
    public void deleteCategory(Long id);
}

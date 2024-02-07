package com.javaee.filmotheque.services.classes;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.repositories.CategoryRepository;
import com.javaee.filmotheque.services.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category createCategory(Category c) {
        return categoryRepository.save(c);
    }

    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(Category c) {
        return categoryRepository.save(c);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}

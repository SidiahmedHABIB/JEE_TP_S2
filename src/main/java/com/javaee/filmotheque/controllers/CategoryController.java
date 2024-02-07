package com.javaee.filmotheque.controllers;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.entities.Film;
import com.javaee.filmotheque.services.classes.CategoryService;
import com.javaee.filmotheque.services.interfaces.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category/")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public List<Category> getAllCategories (){
        return categoryService.findAllCategories();
    }
    @GetMapping("/{id}")
    public Category getCategoryById (@PathVariable Long id){
        return categoryService.findCategoryById(id);
    }
    @PostMapping("/add/")
    public Category createNewCategory (@RequestBody Category c){
        return categoryService.createCategory(c);
    }
    @PutMapping("/update/")
    public Category updateCategory (@RequestBody Category c){
        return categoryService.updateCategory(c);
    }
    @DeleteMapping("/delete/")
    public void deleteCategory (@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
}

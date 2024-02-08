package com.javaee.filmotheque.controllers;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.entities.Film;
import com.javaee.filmotheque.services.interfaces.IActeurService;
import com.javaee.filmotheque.services.interfaces.ICategoryService;
import com.javaee.filmotheque.services.interfaces.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/film")
public class FilmController {
    @Autowired
    IFilmService iFilmService;
    @Autowired
    ICategoryService iCategoryService;
    @Autowired
    IActeurService iActeurService;
    @GetMapping("/all")
    public String getAllFilms (Model model){
        model.addAttribute("categories", iCategoryService.findAllCategories());
        model.addAttribute("film", iFilmService.findAllFilms());
        return "index";
    }
    @GetMapping("/new")
    public String afficheNewForm (Model model){
        model.addAttribute("categories", iCategoryService.findAllCategories());
        model.addAttribute("acteurs", iActeurService.findAllActeurs());
        return "add_film";
    }
    @PostMapping("/add/")
    public String createNewFilm (Film f){
        iFilmService.createFilm(f);
        return "redirect:/film/all";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteFilm (@PathVariable Long id) {
        iFilmService.deleteFilm(id);
        return "redirect:/film/all";
    }
    @GetMapping("/{id}")
    public Film getFilmById (@PathVariable Long id){
        return iFilmService.findFilmById(id);
    }
    @GetMapping("/update/{id}")
    public String afficheModificationForm (@PathVariable Long id,Model model){
        model.addAttribute("film", iFilmService.findFilmById(id));
        model.addAttribute("categories", iCategoryService.findAllCategories());
        model.addAttribute("acteurs", iActeurService.findAllActeurs());
        return "update_film";
    }
    @PostMapping("/modifier/")
    public String updateFilm (Film f){
        iFilmService.updateFilm(f);
        return "redirect:/film/all";
    }
    @PostMapping("/find")
    public String getFilmsByTitre (Model model, String titre){
        model.addAttribute("film", iFilmService.findFilmsByTitre(titre));
        return "index";
    }
    @PostMapping("/findc")
    public String getFilmsByCategory (Model model,  @RequestParam(name = "category", required = false, defaultValue = "0") long categoryId){
        model.addAttribute("categories", iCategoryService.findAllCategories());
        if (categoryId != 0) {
            Category selectedCategory = iCategoryService.findCategoryById(categoryId);
            model.addAttribute("film", iFilmService.findFilmsByCategory(selectedCategory));
        } else {
            model.addAttribute("film", iFilmService.findAllFilms());
        }
        model.addAttribute("categoriesId", categoryId);
        return "index";
    }



}

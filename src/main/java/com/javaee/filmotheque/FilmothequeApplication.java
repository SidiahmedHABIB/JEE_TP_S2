package com.javaee.filmotheque;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.entities.Film;
import com.javaee.filmotheque.services.classes.CategoryService;
import com.javaee.filmotheque.services.classes.FilmService;
import com.javaee.filmotheque.services.interfaces.ICategoryService;
import com.javaee.filmotheque.services.interfaces.IFilmService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class FilmothequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmothequeApplication.class, args);
	}
	@Bean
	CommandLineRunner start(
			IFilmService iFilmService,
			ICategoryService iCategoryService
	){
	return  args->{
		/*System.out.println("**********Film***********");
		Category category = iCategoryService.createCategory(new Category(null,"Action",null));
		if(category!= null){
			iFilmService.createFilm(new Film(null,"The Mauritanien","film talk about usa prism",2024,category));
		}
		System.out.println("**********Film***********");
*/
	};
	}
}

package com.javaee.filmotheque.repositories;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film,Long> {
    List<Film> findByTitreContaining(String name);
    List<Film> findByCategory(Category c);

}

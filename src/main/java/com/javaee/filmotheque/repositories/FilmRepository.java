package com.javaee.filmotheque.repositories;

import com.javaee.filmotheque.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Long> {

}

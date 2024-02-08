package com.javaee.filmotheque.services.interfaces;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.entities.Film;

import java.util.List;

public interface IFilmService {
    public Film createFilm(Film f);
    public Film findFilmById(Long id);
    public List<Film> findAllFilms();
    public Film updateFilm (Film f);
    public void deleteFilm(Long id);
    public List<Film> findFilmsByTitre(String titre);
    public List<Film> findFilmsByCategory(Category c);

}

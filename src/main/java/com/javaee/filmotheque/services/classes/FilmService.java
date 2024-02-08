package com.javaee.filmotheque.services.classes;

import com.javaee.filmotheque.entities.Category;
import com.javaee.filmotheque.entities.Film;
import com.javaee.filmotheque.repositories.FilmRepository;
import com.javaee.filmotheque.services.interfaces.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmService implements IFilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Override
    public Film createFilm(Film f) {
        return filmRepository.save(f);
    }

    @Override
    public Film findFilmById(Long id) {
        return filmRepository.findById(id).get();
    }

    @Override
    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public Film updateFilm(Film f) {
        return filmRepository.save(f);
    }

    @Override
    public void deleteFilm(Long id) {
        filmRepository.deleteById(id);
    }

    @Override
    public List<Film> findFilmsByTitre(String titre) {
        return filmRepository.findByTitreContaining(titre);
    }

    @Override
    public List<Film> findFilmsByCategory(Category c) {
        return filmRepository.findByCategory(c);
    }
}

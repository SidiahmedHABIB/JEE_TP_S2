package com.javaee.filmotheque.services.interfaces;

import com.javaee.filmotheque.entities.Acteur;
import com.javaee.filmotheque.entities.Film;

import java.util.List;

public interface IActeurService {
    public Acteur createActeur(Acteur a);
    public Acteur findActeurById(Long id);
    public List<Acteur> findAllActeurs();
    public Acteur updateActeur (Acteur a);
    public void deleteActeur(Long id);
}

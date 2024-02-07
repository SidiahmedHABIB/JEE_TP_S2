package com.javaee.filmotheque.services.classes;

import com.javaee.filmotheque.entities.Acteur;
import com.javaee.filmotheque.repositories.ActeurRepository;
import com.javaee.filmotheque.services.interfaces.IActeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActeurService implements IActeurService {
    @Autowired
    ActeurRepository acteurRepository;
    @Override
    public Acteur createActeur(Acteur a) {
        return acteurRepository.save(a);
    }

    @Override
    public Acteur findActeurById(Long id) {
        return acteurRepository.findById(id).get();
    }

    @Override
    public List<Acteur> findAllActeurs() {
        return acteurRepository.findAll();
    }

    @Override
    public Acteur updateActeur(Acteur a) {
        return acteurRepository.save(a);
    }

    @Override
    public void deleteActeur(Long id) {
        acteurRepository.deleteById(id);
    }
}

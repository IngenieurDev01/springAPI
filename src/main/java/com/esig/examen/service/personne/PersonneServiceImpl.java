package com.esig.examen.service.personne;

import com.esig.examen.dao.PersonneDao;
import com.esig.examen.modele.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonneServiceImpl implements PersonneService {
    @Autowired
    private final PersonneDao personneDao;

    public PersonneServiceImpl(PersonneDao personneDao) {
        this.personneDao = personneDao;
    }
    @Override
    public Personne CreatePersonne(Personne personne) {
        return personneDao.save(personne);
    }

    @Override
    public List<Personne> ReadPersonne() {
        return personneDao.findAll();
    }

    @Override
    public Personne UpdatePersonne(Long id, Personne personne) {
        return personneDao.findById(id).map(
                personne1 -> {
                    personne1.setNom(personne.getNom());
                    personne1.setPrenom(personne.getPrenom());
                    personne1.setSexe(personne.getSexe());
                    return personneDao.save(personne1);
                }
        ).orElseThrow(() -> new RuntimeException("Personne n'existe pas"));
    }

    @Override
    public String DeletePersonne(Long id) {
        personneDao.findById(id);
        return "Personne supprimé avec succes";
    }
}

package com.esig.examen.service.personne;
import com.esig.examen.modele.Personne;

import java.util.List;

public interface PersonneService {
    Personne CreatePersonne(Personne personne);
    List<Personne> ReadPersonne();
    Personne UpdatePersonne(Long id, Personne personne);
    String DeletePersonne(Long id);
}

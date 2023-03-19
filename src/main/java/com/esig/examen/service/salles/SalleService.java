package com.esig.examen.service.salles;

import com.esig.examen.modele.Salle;

import java.util.List;

public interface SalleService {
//    Dans cette interface SalleService nous aurons nos 4 méthodes

    Salle CreateSalle(Salle salle); // creer salle
    List<Salle> ReadSalle(); // lister salle qui retourne la liste des salles
    Salle UpdateSalle(Long id, Salle salle); // mise à jour de l'id de la salle à modifier
    String DeleteSalle(Long id); // suppression de l'id et retourne une chaine de caractère
}

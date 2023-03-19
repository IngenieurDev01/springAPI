package com.esig.examen.dao;

import com.esig.examen.modele.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDao extends JpaRepository<Personne, Long> {
}

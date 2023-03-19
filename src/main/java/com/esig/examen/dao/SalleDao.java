package com.esig.examen.dao;

import com.esig.examen.modele.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleDao extends JpaRepository<Salle, Long> {
}

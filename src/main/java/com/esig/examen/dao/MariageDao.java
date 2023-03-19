package com.esig.examen.dao;

import com.esig.examen.modele.Mariage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MariageDao extends JpaRepository<Mariage, Long> {
}

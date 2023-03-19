package com.esig.examen.dao;

import com.esig.examen.modele.Invite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InviteDao extends JpaRepository<Invite, Long> {
}

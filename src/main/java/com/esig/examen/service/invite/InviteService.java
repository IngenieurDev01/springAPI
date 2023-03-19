package com.esig.examen.service.invite;

import com.esig.examen.modele.Invite;

import java.util.List;
public interface InviteService {
    Invite CreateInvite(Invite invite);
    List<Invite> ReadInvite();
    Invite UpdateInvite(Long id, Invite invite);
    String DeleteInvite(Long id);
}

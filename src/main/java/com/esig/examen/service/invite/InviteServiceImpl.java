package com.esig.examen.service.invite;

import com.esig.examen.dao.InviteDao;
import com.esig.examen.modele.Invite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InviteServiceImpl implements InviteService{
    @Autowired
    private final InviteDao inviteDao;

    public InviteServiceImpl(InviteDao inviteDao) {
        this.inviteDao = inviteDao;
    }

    @Override
    public Invite CreateInvite(Invite invite) {
        return inviteDao.save(invite);
    }

    @Override
    public List<Invite> ReadInvite() {
        return inviteDao.findAll();
    }

    @Override
    public Invite UpdateInvite(Long id, Invite invite) {
        return inviteDao.findById(id).map(
                invite1 -> {
                    invite1.setStatus(invite.getStatus());
                    return inviteDao.save(invite1);
        }
        ).orElseThrow(() -> new RuntimeException("L'invité n'existe pas"));
    }

    @Override
    public String DeleteInvite(Long id) {
        inviteDao.findById(id);
        return "L'invité dont l'Id est"+id+" à été supprimer avec succès";
    }
}

package com.esig.examen.service.salles;

import com.esig.examen.dao.SalleDao;
import com.esig.examen.modele.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalleServiceImpl implements SalleService {
    @Autowired
    private final SalleDao salleDao;

    public SalleServiceImpl(SalleDao salleDao) {
        this.salleDao = salleDao;
    }

    @Override
    public Salle CreateSalle(Salle salle) {
        return salleDao.save(salle);
    }

    @Override
    public List<Salle> ReadSalle() {
        return salleDao.findAll();
    }

    @Override
    public Salle UpdateSalle(Long id, Salle salle) {
        return salleDao.findById(id).map(
                salle1 -> {
                    salle1.setAdresse(salle.getAdresse());
                    salle1.setCapacite(salle.getCapacite());
                    salle1.setNomSalle(salle.getNomSalle());
                    return salleDao.save(salle1);
                }
        ).orElseThrow(() -> new RuntimeException("Salle n'existe pas"));
    }

    @Override
    public String DeleteSalle(Long id) {
        salleDao.deleteById(id);
        return "La salle dont l'Id est "+id+" à été supprimée avec succés !!!";
    }
}

package com.esig.examen.service.mariage;

import com.esig.examen.dao.MariageDao;
import com.esig.examen.modele.Mariage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MariageServiceImpl implements MariageService{
    @Autowired
    private final MariageDao mariageDao;

    public MariageServiceImpl(MariageDao mariageDao) {
        this.mariageDao = mariageDao;
    }
    @Override
    public Mariage CreateMariage(Mariage mariage) {
        return mariageDao.save(mariage);
    }

    @Override
    public List<Mariage> ReadMariage() {
        return mariageDao.findAll();
    }

    @Override
    public Mariage UpdateMariage(Long id, Mariage mariage) {
        return mariageDao.findById(id).map(
                mariage1 -> {
                    mariage1.setDateMariage(mariage.getDateMariage());
                    return mariageDao.save(mariage1);
                }
        ).orElseThrow(() -> new RuntimeException("N'existe pas"));
    }

    @Override
    public String DeleteMariage(Long id) {
        mariageDao.findById(id);
        return "L'Id "+id+" à été supprimer avec succès";
    }
}

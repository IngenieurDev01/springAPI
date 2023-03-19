package com.esig.examen.service.mariage;

import com.esig.examen.modele.Mariage;

import java.util.List;

public interface MariageService {
    Mariage CreateMariage(Mariage mariage);
    List<Mariage> ReadMariage();
    Mariage UpdateMariage(Long id, Mariage mariage);
    String DeleteMariage(Long id);
}

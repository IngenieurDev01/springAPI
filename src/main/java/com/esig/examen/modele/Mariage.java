package com.esig.examen.modele;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Mariage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMariage;
    private Date dateMariage;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPersonne", insertable = false, updatable = false)
    private Personne personne;

    public Mariage() {
    }

    public Mariage(Long idMariage, Date dateMariage) {
        IdMariage = idMariage;
        this.dateMariage = dateMariage;
    }

    public Long getIdMariage() {
        return IdMariage;
    }

    public void setIdMariage(Long idMariage) {
        IdMariage = idMariage;
    }

    public Date getDateMariage() {
        return dateMariage;
    }

    public void setDateMariage(Date dateMariage) {
        this.dateMariage = dateMariage;
    }

    @Override
    public String toString() {
        return "Mariage{" +
                "IdMariage=" + IdMariage +
                ", dateMariage=" + dateMariage +
                '}';
    }
}

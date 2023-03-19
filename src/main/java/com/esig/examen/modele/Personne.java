package com.esig.examen.modele;

import lombok.Data;
import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Data
@Transactional
@Table(name = "personne")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personne")
    private Long IdPersonne;
    private String nom;
    private String prenom;
    private String sexe;

    @OneToOne(mappedBy = "personne")

    private Invite invite;

    public Personne() {
    }

    public Personne(Long idPersonne, String nom, String prenom, String sexe) {
        IdPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public Long getIdPersonne() {
        return IdPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        IdPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "IdPersonne=" + IdPersonne +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                '}';
    }
}

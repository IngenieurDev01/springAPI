package com.esig.examen.modele;

import javax.persistence.*;

@Entity
@Table(name = "invite")
public class Invite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invite")
    private Long IdInvite;
    private String status;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPersonne", insertable = true, updatable = true)
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "IdPersonne", referencedColumnName = "IdPersonne")
    private Personne personne;

    public Invite() {
    }

    public Invite(Long idInvite, String status) {
        IdInvite = idInvite;
        this.status = status;
    }

    public Long getIdInvite() {
        return IdInvite;
    }

    public void setIdInvite(Long idInvite) {
        IdInvite = idInvite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Invite{" +
                "IdInvite=" + IdInvite +

                ", status='" + status + '\'' +
                '}';
    }
}

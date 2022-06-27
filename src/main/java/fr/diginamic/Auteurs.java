package fr.diginamic;

import javax.persistence.*;

@Entity
@Table(name = "Auteur")
public class Auteurs {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auteurs{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Prenom")
    private String prenom;

    public Auteurs() {
    }

    public Auteurs(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

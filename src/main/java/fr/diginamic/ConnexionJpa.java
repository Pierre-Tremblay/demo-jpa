package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-connect");
        EntityManager em = entityManagerFactory.createEntityManager();
        Auteurs auteur = em.find(Auteurs.class, 245);
        if (auteur != null) {
            System.out.println(auteur);
        }

        Auteurs auteur1 = new Auteurs();
        auteur1.setId(245);
        auteur1.setNom("Papincourt");
        auteur1.setPrenom("Marc-Henri");

        em.getTransaction().begin();
        em.merge(auteur1);
        em.getTransaction().commit();


    }
}


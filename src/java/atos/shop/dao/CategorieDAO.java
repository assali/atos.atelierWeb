/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao; 

import atos.shop.entity.Categorie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class CategorieDAO {

    public void ajouter(Categorie c) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();

        em.persist(c);
        em.getTransaction().commit();
    }

    public List<Categorie> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Query qu = em.createQuery("Select c From Categorie c order by c.nom");
        return qu.getResultList();
    }

    public void supprimer(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Query qu = em.createQuery("Delete From Categorie c where c.id=:id");
        qu.setParameter("id", id);
        em.getTransaction().begin();
        //em.remove(em.find(Categorie.class, id));
        qu.executeUpdate();
        em.getTransaction().commit();
    }
}

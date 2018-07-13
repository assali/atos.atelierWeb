/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.dao;

import atos.shop.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class ClientDAO {

    public void ajouter(Client c) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    public List<Client> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery("Select c From Client c order by c.id");
        return query.getResultList();

    }

    /**
     * 
     * @param email
     * @param mdp
     * @return null si pas trouvé 
     */
    public Client findParEmailAndMdp(String email, String mdp) {
        try {
            EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
            Query query = em.createQuery("Select c From Client c where c.email=:email and c.mdp=:mdp");
            query.setParameter("email", email);
            query.setParameter("mdp", mdp);

            return (Client) query.getSingleResult();
        } catch (Exception e) {

            return null;
        }

    }

}

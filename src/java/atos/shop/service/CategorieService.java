/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.CategorieDAO;
import atos.shop.entity.Categorie;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class CategorieService {

    private CategorieDAO dao=new CategorieDAO();

    public void ajouterCat(Categorie c) {
        dao.ajouter(c);
    }

    public List<Categorie> lister() {
       return dao.lister();
    }

    public void supprimerCat(Long id) {
        dao.supprimer(id);
    }
    
}

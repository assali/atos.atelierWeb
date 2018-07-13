/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.service;

import atos.shop.dao.ClientDAO;
import atos.shop.entity.Client;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ClientService {
    private ClientDAO dao=new ClientDAO();
    
    public void ajouterClient(Client c)
    {
    dao.ajouter(c);
    }
    public List<Client> lister()
    {
    return dao.lister();
    }
    public Client connexion(String email, String mdp)
    {
    return dao.findParEmailAndMdp(email, mdp);
    }
    
}

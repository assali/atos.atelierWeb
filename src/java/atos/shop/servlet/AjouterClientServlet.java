/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Client;
import atos.shop.service.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AjouterClientServlet", urlPatterns = { "/ajouter-client"}) 
public class AjouterClientServlet extends HttpServlet {
    
    private ClientService service = new ClientService();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouter-client.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //long id =Long.parseLong(req.getParameter("id"));
         String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String adresse = req.getParameter("adresse");
        Integer numRue = Integer.parseInt(req.getParameter("numRue"));
        Long codePostal = Long.parseLong(req.getParameter("codePostal"));
        String email=req.getParameter("email");
        String mdp=req.getParameter("password");
        Client c = new Client();
        c.setNom(nom);
        c.setPrenom(prenom);
        c.setAdresse(adresse);
        c.setNumRue(numRue);
        c.setCodePostal(codePostal);
        c.setEmail(email);
        c.setMdp(mdp);
        service.ajouterClient(c);
        
        resp.sendRedirect("lister-clients");
    }
    
}

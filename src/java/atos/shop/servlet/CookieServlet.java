/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "CookieServlet", urlPatterns = {"/CookieServlet"})
public class CookieServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String mdp = req.getParameter("mdp");
//        Cookie c = new Cookie("motDePasseTopSecret", "1234");
//        c.setMaxAge(100000);
//
//        resp.addCookie(c);
//        resp.addCookie(new Cookie("categoriePreferee", "sf"));
//        resp.addCookie(new Cookie("derniereAchat", "kkskjsk"));
//        resp.addCookie(new Cookie("dernieirePageVisitee", "http;//djdkldj.djkdjk.com"));
        resp.addCookie(new Cookie("pseudo", "Admin"));
         
        
    }
    
}

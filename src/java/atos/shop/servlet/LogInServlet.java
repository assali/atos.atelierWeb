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
@WebServlet(name = "LogInServlet", urlPatterns = {"/log-in"})
public class LogInServlet extends HttpServlet {

    private ClientService service = new ClientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          
        req.getRequestDispatcher("log-in.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String mdp = req.getParameter("mdp");
        Client c = service.connexion(email, mdp);
        if (c != null) {
            req.getSession().setAttribute("logIn", c);
            req.getSession().removeAttribute("logInFail");

            //redirect to servlet
            resp.sendRedirect("home-page");
        } else {
            req.getSession().setAttribute("logInFail", "fail");
             resp.sendRedirect("log-in");

//            req.setAttribute("logInFail", "fail");
//            resp.sendRedirect("log-in");

        }
    }

}

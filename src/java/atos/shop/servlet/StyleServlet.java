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
@WebServlet(name = "StyleServlet", urlPatterns = {"/changeStyle"})
public class StyleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//définit cookie a partir d'url  param "style"
        Cookie c = new Cookie("style", req.getParameter("style"));
        c.setMaxAge(60 * 60 * 24 * 30);
        resp.addCookie(c);

        //Redirection vers template
        //req.getRequestDispatcher("_TEMPLATE.jsp").forward(req, resp);
        resp.sendRedirect("home-page");
    }

}

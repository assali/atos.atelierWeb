
<%-- 
Document   : _TEMPLATE
Created on : 10 juil. 2018, 16:42:35
Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Cache-Control" content="no-cache" />
        <meta http-equiv="Content-Type" content="te xt/html; charset=UTF-8">
        <title>Home Page</title>
        <c:import url="stylesheet"/>
    </head>
    <body>
        <div id="container">
            <c:import url="_TITRE.jsp"/>
            <c:import url="menu"/>
            <div id="contenu">
                <table class="table table-dark">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Nom</th>
                            <th scope="col">Prenom </th>
                            <th scope="col">Adresse</th>
                            <th scope="col">Email</th>
                            <th scope="col">Password </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">${logIn.id}</th>
                            <td>${logIn.nom}</td>
                            <td>${logIn.prenom}</td>
                            <td>${logIn.adresse}</td>
                            <td>${logIn.email}</td>
                            <td>${logIn.mdp}</td>
                        </tr>
                    </tbody>
                </table>

            </div>
            <c:import url="_PIED.jsp"/>
            <c:import url="_JAVASCRIPTS.jsp"/>
        </div>
    </body>
</html>

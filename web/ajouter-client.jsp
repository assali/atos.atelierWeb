<%-- 
    Document   : ajouter-client
    Created on : 10 juil. 2018, 10:13:24
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
              crossorigin="anonymous">
        <title>Nouveau Client</title>
        <link rel="stylesheet" href="css/ajouter-cat.css">

    </head>
    <body>

        <h1>Nouveau Client</h1>

        <form method="POST" id="formStyleclient">
            <div class="form-group">
                <label for="nom">Nom</label>
                <input type="text" class="form-control" name="nom" placeholder="Nom">
            </div>
            <div class="form-group">
                <label for="prenom">Prénom</label>
                <input type="text" class="form-control" name="prenom" placeholder="Prenom">
            </div>
            <div class="form-group">
                <label for="adresse">Adresse</label>
                <input type="text" class="form-control" name="adresse" placeholder="Adresse">
            </div>
            <div class="form-group">
                <label for="numRue">Rue</label>
                <input type="text" class="form-control" name="numRue" placeholder="numRue">
            </div>
            <div class="form-group">
                <label for="codePostal">Code Postale </label>
                <input type="text" class="form-control" name="codePostal" placeholder="CodePostale">
            </div>
            <div class="form-group">
                <label for="email">Email </label>
                <input type="email" class="form-control" name="email" placeholder="Email">
            </div>
            <div class="form-group">
                <label for="password">Password </label>
                <input type="password" class="form-control" name="password" placeholder="password">
            </div>
            <button type="submit" class="btn btn-primary">Ajouter</button>
        </form>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>

   
    </body>
</html>

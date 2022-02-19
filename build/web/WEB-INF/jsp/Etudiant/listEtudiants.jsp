<%-- 
    Document   : listEtudiants
    Created on : Oct 23, 2021, 1:16:18 PM
    Author     : Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <table id="table">
           <tr>
               <th>CNE</th>
               <th>Nom</th>
               <th>Prenom</th>
               <th>Filiere</th>
               <th>Edit</th>
               <th>Delete</th>
           </tr>
             <c:forEach var="etu" items="${etudiants}">
                    <tr>  
                    <td>${etu.cne}</td>
                    <td>${etu.nom}</td> 
                    <td>${etu.prenom}</td>
                    <td>${etu.filiere.libelle}</td>
                    <td><a href="editEtudiant?id=${etu.cne}"  class="btn btn-warning">Edit</a></td> 
                    <td><a href="deleteEtudiant?id=${etu.cne}" 
                           onclick="if (!(confirm('Etes vous sur de vouloir supprimer cet etudiant ?'))) return false" class="btn btn-danger">Delete</a></td>  
                    </tr>  
            </c:forEach> 
       </table>  
    </body>
</html>
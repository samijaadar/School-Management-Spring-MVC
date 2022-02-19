<%-- 
    Document   : listEtudiants
    Created on : Oct 23, 2021, 1:16:18 PM
    Author     : Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container">
       <form action="findStudents" method="get" >
           <h1 style="text-align: center">${filiere.libelle}</h1><br>
            <table>
               
                <tr><td>Filiere:</td><td>
                        <select name="filiere" onchange='this.form.submit()'>
                            <option value=""></option>
                            <option value="0">Non attaché</option>
                            <c:forEach var="fil" items="${filieres}"> 
                                <option value="${fil.idFiliere}">${fil.libelle}</option>
                            </c:forEach> 
                        </select>
                    </td></tr>
            </table>
        </form>
            <table id="table">
                <tr>
                    <th>CNE</th>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Filiere</th>
                </tr>
                
                 <c:forEach var="etu" items="${etudiants}">
                    <tr>
                        <td>${etu.cne}</td>
                        <td>${etu.nom}</td> 
                        <td>${etu.prenom}</td>
                        <td>${etu.filiere.libelle}</td>
                    </tr>
                 </c:forEach> 
               
            </table>
        </div>
    </body>
</html>


<%-- 
    Document   : listFiliere
    Created on : Oct 23, 2021, 12:27:06 PM
    Author     : Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
       <table id="table">
           <tr>
               <th>Code</th>
               <th>Nom Filiere</th>
               <th>Edit</th>
               <th>Delete</th>
           </tr>
                <c:forEach var="fil" items="${filieres}">
                    <tr>  
                    <td>${fil.code}</td>  
                    <td>${fil.libelle}</td>  
                    <td><a href="editFiliere?id=${fil.idFiliere}"  class="btn btn-warning">Edit</a></td> 
                    <td><a href="deleteFiliere?id=${fil.idFiliere}" 
                           onclick="if (!(confirm('Etes vous sur de vouloir supprimer cet Filiere ?'))) return false" class="btn btn-danger">Delete</a></td>  
                    </tr>  
                </c:forEach> 
       </table>
       
    </body>
</html>
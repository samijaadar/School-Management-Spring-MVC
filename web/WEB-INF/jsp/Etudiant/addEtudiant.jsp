<%-- 
    Document   : etudiant
    Created on : Oct 21, 2021, 12:11:44 PM
    Author     : Sami
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Etudiant</title>
    </head>
    <body>
        <%@include file="../header.jsp" %>
        <div class="container">
        <form:form action="addEtudiant" method="get" modelAttribute="etudiant">   
            <table class="table">
                <tr><td>CNE:</td><td><form:input path="cne" required="required" /></td></tr>
                <tr><td>Nom</td><td><form:input path="nom" required="required"/></td></tr>
                <tr><td>Prenom</td><td><form:input path="prenom" required="required"/></td></tr>
                <tr><td>Filiere</td><td>
                        <select name="idFiliere">
                           <option value="0">Non Attach.</option>
                           <c:forEach var="fil" items="${filieres}"> 
                                <option value="${fil.idFiliere}">${fil.libelle}</option>
                           </c:forEach> 
                        </select>
                </td></tr>  
                <tr><td colspan="2"><input type="submit" value="submit"></td></tr>
            </table>
        </form:form> 
        
        <%@include file="listEtudiants.jsp" %>
        </div>
    </body>
</html>
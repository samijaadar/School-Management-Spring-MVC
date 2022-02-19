<%-- 
    Document   : editEtudiant
    Created on : Oct 23, 2021, 1:16:05 PM
    Author     : Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Etudiant</title>
    </head>
    <body>
        <%@include file="../header.jsp" %>
        <div class="container">
        <form:form method="get" action="updateEtudiant" modelAttribute="etudiant"> 
            <table>
                <tr><td>CNE:</td><td><form:input path="cne" readonly="true"/></td></tr>
                <tr><td>Nom</td><td><form:input path="nom" required="required" /></td></tr>
                <tr><td>Prenom</td><td><form:input path="prenom" required="required" /></td></tr>
                <tr><td>Filiere</td><td>
                        <select name="idFiliere">
                           <option value="${etudiant.filiere.idFiliere}">${etudiant.filiere.libelle}</option>
                           <option value="0">Non Attach.</option>
                           <c:forEach var="fil" items="${filieres}"> 
                                <option value="${fil.idFiliere}">${fil.libelle}</option>
                           </c:forEach> 
                        </select>
                </td></tr>  
                <tr><td colspan="2"><input type="submit" value="submit"></td></tr>
            </table>
        </form:form>
        </div>
    </body>
</html>

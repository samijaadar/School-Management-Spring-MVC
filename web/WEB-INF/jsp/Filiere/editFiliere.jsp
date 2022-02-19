<%-- 
    Document   : editFiliere
    Created on : Oct 23, 2021, 12:38:58 PM
    Author     : Sami
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../header.jsp" %>
        <div class="container">
        
            
            
            <form:form method="get" action="updateFiliere" modelAttribute="filiere"> 
                <form:hidden path="IdFiliere"  />
                <table style="margin: auto">
                <tr><td>Code:</td><td><form:input path="code"/></td></tr>
                <tr><td>Nom Filiere:</td><td><form:input path="libelle"/></td></tr>
                <tr><td colspan="2"><input type="submit" value="submit"></td></tr>
                </table>
            </form:form>
        </div>
    </body>
</html>

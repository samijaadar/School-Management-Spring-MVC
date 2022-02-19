<%-- 
    Document   : index
    Created on : Oct 23, 2021, 12:51:34 PM
    Author     : Sami
--%>

<html>
    <body>
        <%@include file="header.jsp" %>
        <h1>ENSAT - École nationale des sciences appliquées de Tanger</h1>
        <div id="container">
                <div><a href="<%=request.getContextPath()%>/Filiere/">Filiere</a></div>
                <div><a href="<%=request.getContextPath()%>/Etudiant/">Etudiant</a></div>
                <div><a href="<%=request.getContextPath()%>/Filiere/findStudents">Recherche</a></div>
        </div>
    </body>
</html>


<style>
*{text-decoration: none;}
#container {
  margin:10% 10% auto 10%;
  display: flex;                 
  flex-direction: row;            
  flex-wrap: nowrap;              
  justify-content: space-around; 
  align-items: center
}
#container > div {
    width: 200px;
    height: 150px;
    border: 2px solid gray;
    font-size:30px;
    text-align: center;
    color:#1d2c55 ;
    font-weight: bold;
}
#container a{
    position: relative;
    top: 40%;
    color:#00BCD4;
    transform: translateY(-60%);
}


h1{
    margin:8% auto;
    text-align: center;
    font-size:30px;
    color:#fbbc34;
    font-weight: bold;
}
</style>
<%-- 
    Document   : index
    Created on : Oct 23, 2021, 12:51:34 PM
    Author     : Sami
--%>

<div class="topnav" id="myTopnav">
        <a href="<%=request.getContextPath()%>" class="active">Home</a>
        <a href="<%=request.getContextPath()%>/Filiere/">Ajouter filiere</a>
        <a href="<%=request.getContextPath()%>/Etudiant/">Ajouter etudiant</a>
        <a href="<%=request.getContextPath()%>/Filiere/findStudents">Recherche par Filiere</a>
        
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
        
</div>

       
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
.container{
  margin: 5% auto;
  width: 50%;
}
.container table{
    width:100%;
    margin-bottom: 5%;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: white;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 600px) {
  .topnav a:not(:first-child) {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
}

@media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }
}
#table {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#table td, #table th {
  border: 1px solid #ddd;
  padding: 8px;
}

#table tr:nth-child(even){background-color: #f2f2f2;}

#table tr:hover {background-color: #ddd;}

input[type="submit"] {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 8px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}
input[type="text"],
select{
    height:20px;
}
.table td{
    font-weight: bold;
}
</style>


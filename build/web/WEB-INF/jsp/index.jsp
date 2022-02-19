<%-- 
    Document   : login
    Created on : Jan 6, 2022, 7:55:41 PM
    Author     : Sami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login form using html5 and css3 animation effects</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js" charset="utf-8"></script>
</head>
<body>
  <form action="login" id="login-form" method="get">
      <h1>Welcome Back</h1>
      <div class="input-box">
          <label>Login</label>
          <input type="text"name="login">
          <span></span>
      </div>

      <div class="input-box">
          <label>Password</label>
          <input type="password" name="password">
          <span></span>
      </div>


      <button type="submit" class="login-btn">Login</button>

    
  </form>
</body>
</html>
<style>
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    font-family: arial;
    box-sizing: border-box;
}
body {
    background-color: #00BCD4;
}
#login-form {
    width: 450px;
    background: #fff;
    padding: 80px 40px;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%,-50%);
    margin: 20px 0px;
}
#login-form h1 {
    text-align: center;
    margin-bottom: 60px;
    color: #00bcd4;
    font-size: 30px;
}
#login-form p {
    font-size: 16px;
    color: #333;
}
#login-form p a {
    color: #00bcd4;
}
#login-form label {
    color: #848484;
}
.input-box{
    border-bottom: 2px solid #adadad;
    position: relative;
    margin: 30px 0;
}
.input-box input{
    font-size: 15px;
    color: #333;
    border: none;
    width: 100%;
    outline: none;
    background: none;
    padding: 0 5px;
    height: 40px;
}
.input-box span::before{
    content: attr(data-placeholder);
    position: absolute;
    top: 50%;
    left: 5px;
    color: #adadad;
    transform: translateY(-50%);
    z-index: -1;
    transition: .5s;
}
.input-box span::after{
    content: '';
    position: absolute;
    width: 0%;
    height: 2px;
    background: linear-gradient(120deg,#2196F3,#FF5722);
    transition: .5s;
}
.focus + span::before{
    top: -5px;
}
.focus + span::after{
    width: 100%;
}
.login-btn {
    display: block;
    width: 100%;
    height: 50px;
    border: none;
    background: linear-gradient(70deg,#2196F3,#03bcd4,#2196F3);
    background-size: 200%;
    color: #fff;
    outline: none;
    cursor: pointer;
    margin: 20px 0px 0px;
    border-radius: 50px;
    transition: .5s;
    font-size: 18px;
    letter-spacing: 1px;
}
.login-btn:hover{
    background-position: right;
}
.bottom-links{
    margin-top: 30px;
    text-align: center;
    font-size: 13px;
}

/*--For Small Devices CSS--*/
@media (max-width: 575px){
#login-form {
    width: 300px;
}
}
</style>

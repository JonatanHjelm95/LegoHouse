<%-- 
    Document   : loginpage
    Created on : Oct 11, 2018, 12:51:35 PM
    Author     : jonab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel = "stylesheet"
              type = "text/css"
              href = "indexStyle.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>loginpage</title>
    </head>
    <body>
        <%=request.getAttribute("menu")%>
        <!--<div class="topnav">
            <form id="Home" action="FrontController" method="POST">
                <input type="hidden" name="command" value="home">
                <input id="btn" type="submit" value="Home">
            </form>
            <form id="createHouse" action="FrontController" method="POST">
                <input type="hidden" name="command" value="createHouse">
                <input id="btn" type="submit" value="Create House">
            </form>
            <form id="register" action="FrontController" method="POST">
                <input type="hidden" name="command" value="registerpage">
                <input id="btn" type="submit" value="Register">
            </form>
            <form id="login" action="FrontController" method="POST">
                <input type="hidden" name="command" value="loginpage">
                <input id="btn" class="active" type="submit" value="Login">
            </form>
        </div>-->

        <form action="FrontController" method="POST">
            <input type="hidden" name="command" value="login">
            Email:<br>
            <input type="text" name="email" placeholder="email">
            <br>
            Password:<br>
            <input type="password" name="password" placeholder="password">
            <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>

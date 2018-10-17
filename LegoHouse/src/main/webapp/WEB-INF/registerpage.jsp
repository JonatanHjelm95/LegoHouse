<%-- 
    Document   : registerpage
    Created on : Oct 11, 2018, 2:07:22 PM
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
        <title>register Page</title>
    </head>
    <body>
        <div class="topnav">
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
                <input id="btn" class="active" type="submit" value="Register">
            </form>
            <form id="login" action="FrontController" method="POST">
                <input type="hidden" name="command" value="loginpage">
                <input id="btn" type="submit" value="Login">
            </form>
        </div>

        <form name="register" action="FrontController" method="POST">
            <input type="hidden" name="command" value="register">
            Email:<br>
            <input type="text" name="email" value="someone@nowhere.com">
            <br>
            Password:<br>
            <input type="password" name="password1" value="sesam">
            <br>
            Retype Password:<br>
            <input type="password" name="password2" value="sesam">
            <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
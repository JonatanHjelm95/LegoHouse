<%-- 
    Document   : errorpage
    Created on : Oct 13, 2018, 12:27:35 PM
    Author     : Jonatan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=request.getAttribute("menu")%>
        <h1> <%=request.getAttribute("error")%></h1>
    </body>
</html>

<%-- 
    Document   : listahabitaciones
    Created on : 03-jun-2014, 23:23:24
    Author     : Meli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <input type="text" value="<%out.print(request.getParameter("user"));%>" name="val"/>
        <ul>
        <% for(int i =0;i<10;i++){ %>
        <li><%out.print(request.getParameter("user"));%> </li>
        <% }%>
        </ul>
    </body>
</html>

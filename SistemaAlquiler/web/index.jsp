<%-- 
    Document   : index
    Created on : 31-may-2014, 7:12:37
    Author     : Meli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sah.controller.Meli"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <% 
            out.println("Hola meli melosa"); %>
        </ h1>
        <form action="views/listahabitaciones.jsp" method="get">
            <label>Ususario</label>
            <input type="text" id="user" name="user"/>
            <label>Password</label>
            <input type="text" id="pass" name="pass"/>
            <input type="submit" value="enviar"/>
        </form>
       
    </body>
</html>

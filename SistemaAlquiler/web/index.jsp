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
        </h1>
        <%
        Meli meli=new Meli();
        out.print(meli.prueba());
        %>
    </body>
</html>

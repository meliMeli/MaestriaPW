<%-- 
    Document   : index
    Created on : 25-jul-2012, 15:06:33
    Author     : GC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Alquiler de habitaciones para estudiantes</title>
    </head>
    <body>
        <h1>Datos</h1>
        <form action="guardar_cliente" method="Post">
            Nomre:<input type="text" name="nombre"><br/>
            Apellido:<input type="text" name="apellido"><br/>
            <input type="submit" value="Guardar datos">
            <a href="Mostrar"> Mostrar </a>
        </form>
    </body>
</html>
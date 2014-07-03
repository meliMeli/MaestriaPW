<%-- 
    Document   : regstroHabitacionesFaces
    Created on : 01-jul-2014, 20:52:07
    Author     : Meli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>

            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <meta charset="utf-8"/>
            <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no"/>
            <meta name="description" content=""/>
            <meta name="author" content=""/>

            <!-- Bootstrap Core CSS -->
            <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
            <link href="css/freelancer.css" rel="stylesheet" type="text/css"/>

            <!-- Fonts -->
            <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
            <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'/>
            <meta charset="utf-8"/>
            <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
            <meta name="viewport" content="width=device-width, initial-scale=1"/>
            <!-- Bootstrap -->
            <link href="css/bootstrap.min.css" rel="stylesheet"/>


            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <div class="container-fluid fondoGris">
                <div class="row-fluid  div-titulo">
                    <h3 class="span6">Registrar Habitación </h3>
                    <div class="span6"> <a  href="listarAlumnos.html" class=" btn btn-info fa-input pull-right">Volver a Listado</a>   </div> 
                </div>
                <div class="row-fluid formulario">
                    <form id="frmReghab" method="GET"  action="registroHabitacion"  class="form-horizontal">
                        <fieldset>
                            <legend><h4>Datos Habitación</h4></legend>
                            <h:form id="frmRegistro">
                                <h:message id="msgForm" for="btnEnviar" rendered="true"/>
                                <h:outputText value="Dirección"/>
                                <h:inputText id="txtInput" value="#{registroHabitacionBean.caracteristicas}" validatorMessage="Ingrese solo texto">
                                    <f:validateRegex pattern="^[a-zA-Z]*"/>
                                </h:inputText>
                                
                                 <h:outputText value="Dirección"/>
                                <h:inputText id="txtInput" value="#{registroHabitacionBean.caracteristicas}" validatorMessage="Ingrese solo texto">
                                    <f:validateRegex pattern="^[a-zA-Z]*"/>
                                </h:inputText>
                                
                                 <h:outputText value="Dirección"/>
                                <h:inputText id="txtInput" value="#{registroHabitacionBean.caracteristicas}" validatorMessage="Ingrese solo texto">
                                    <f:validateRegex pattern="^[a-zA-Z]*"/>
                                </h:inputText>

<!--                                <p:outputLabel value="Características"/>
                                <p:inputText id="txtNombre" />

                                <p:outputLabel value="Sexo"/>
                                <p:selectOneMenu id="cmbText" >
                                    
                                </p:selectOneMenu>-->

                                <h:message id="msg" for="txtInput" rendered="true"/>
                                <h:commandButton id="btnEnviar" value="Enviar"  actionListener="#{registroHabitacionBean.enviarRegistro()}" >

                                </h:commandButton>
                            </h:form>



                            </div>
                            </div>
                            </body>

                            <footer class="text-center">
                                <div class="footer-below">
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                Copyright  2014 - @Karla @Meli
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </footer>
                            </html>
                        </f:view>

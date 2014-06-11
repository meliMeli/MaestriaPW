<%-- 
    Document   : listahabitaciones
    Created on : 03-jun-2014, 23:23:24
    Author     : Meli
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sah.controller.Meli"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/freelancer.css" rel="stylesheet" type="text/css">

        <!-- Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class=" span2">
                </div>
                <div class=" span10">
                    <h1>SAH</h1>
                    <label>Usuario:</label>
                    <input type="text" value="<%out.print(request.getParameter("user"));%>" name="val"/>

                    <h2>Lista de habitaciones en Arequipa</h2>

                    <hr>
                    <!--<input type="submit" href="registro_cuartos.jsp" value="Agregar cuarto" class="btn btn-success btn-large" >-->
                    <a role="button" href="registro_cuartos.jsp" class="btn btn-primary">Agregar cuartos +</a>
                    <table class="table table-striped">
                        <th> Dirección </th>
                        <th> Detalles </th>
                        <th> Ver </th>
                        <TR> 
                            <TD>Arequipa - Jose Luis Bustamante y Rivero - Calle 4 </TD> 
                            <TD> Una habitación, baño propio, solo para señoritas </TD>
                            <TD> <a role="button" href="detalle_habitacion.jsp" class="btn btn-primary">Ver detalles »</a> </TD>
                        </TR>

                        <TR>
                            <TD>Arequipa - Lambramani - Calle los sauces </TD>
                            <TD> Una habitación, baño propio</TD>
                            <TD> <a role="button" href="detalle_habitacion.jsp" class="btn btn-primary">Ver detalles »</a> </TD>
                        </TR>
                        <TR> 
                            <TD>Arequipa - Jose Luis Bustamante y Rivero - Calle 4 </TD> 
                            <TD> Una habitación, baño propio, solo para señoritas </TD>
                            <TD> <a role="button" href="detalle_habitacion.jsp" class="btn btn-primary">Ver detalles »</a> </TD>
                        </TR>
                    </table>


<!--                    <form action="detalle_habitacion.jsp" method="get">
                        <p><a role="button" class="btn btn-primary">Ver detalles »</a></p>
                    </form>-->




                    <div class="scroll-top page-scroll visible-xs visble-sm">
                        <a class="btn btn-primary" href="#page-top">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                    </div>

                    <!-- Portfolio Modals -->


                    <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
                        <div class="modal-content">
                            <div class="close-modal" data-dismiss="modal">
                                <div class="lr">
                                    <div class="rl">
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>

                    <div class="portfolio-modal modal fade" id="portfolioModal5" tabindex="-1" role="dialog" aria-hidden="true">
                        <div class="modal-content">
                            <div class="close-modal" data-dismiss="modal">
                                <div class="lr">
                                    <div class="rl">
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>

                    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
                    <!-- Include all compiled plugins (below), or include individual files as needed -->
                    <script src="js/bootstrap.min.js"></script>
                </div>
            </div>
        </div>  
    </body>
    <footer class="text-center">
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Copyright &copy; 2014 - @Karla @Meli
                    </div>
                </div>
            </div>
        </div>
    </footer>
</html>

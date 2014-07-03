package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sah.controller.Meli;

public final class sobre_005fnosotros_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/freelancer.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Fonts -->\r\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"tab-cont\">\r\n");
      out.write("\t\t\t\t<div id=\"tabs\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("                                            <li><a href=\"#tabs-1\" class=\"fil\">Filosofía</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#tabs-2\" class=\"vym\">Visión y Misión</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#tabs-3\" class=\"pol\">Política de Calidad</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"tabs-1\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Filosofía</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("                                                    <img src=\"img/filosofia.png\" width=\"255\" height=\"191\" alt=\"filosofia\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<p>Tratar de superar las expectativas de nuestro clientes</p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"ind\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><strong>Liderazgo:</strong> Hacemos que las cosas sucedan...</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><strong>Innovación:</strong> Mejoramos continuamente nuestros procesos y servicios.</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><strong>Integridad:</strong> Somos honestos, transparentes y responsables.</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><strong>Pensamiento Global:</strong> Nuestros referentes con las mejores servicios para todos los clientes.</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><strong>Mejora continua:</strong> Buscamos constantemente optimizar los procesos.</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"tabs-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("                                                    <img src=\"img/misionvision.png\" width=\"225\" height=\"225\" alt=\"misionvision\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<h2>Visión</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>Ser una página web líder en servicios de alquiler de habitaciones para os estudiantes de distintas ciudades, brindando servicios de calidad con compromiso de excelencia, innovación, y la búsqueda de la satisfacción total de sus clientes.</p>\r\n");
      out.write("                                                <br>\r\n");
      out.write("                                                <br>\r\n");
      out.write("                                                <h2>Misión</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>Satisfacer las necesidades y expectativas de todos los clientes involucrados en la búsqueda de un mejor lugar para poder descanzar y estudiar sin tener mayores dificultades.</p>\r\n");
      out.write("                                                <br>\r\n");
      out.write("                                                <br>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                               <h2>Política de Calidad</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/filosofia.png\" width=\"255\" height=\"191\" alt=\"calidad\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<p>El compromiso del Sistema de Aqluiler de Habitaciones se basa en:</p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"ind\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>La Búsqueda continua de la excelencia en los procesos de prestación de nuestros servicios con la finalidad de satisfacer las necesidades de nuestros clientes con un servicio calificado.</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>La Búsqueda constante de nuevos y mejores funcionalidades para complementar la atención de los clientes.</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                    <div class=\"text-center\">                                                                                                             \r\n");
      out.write("                        <a class=\"btn fa-input right\" href=\"views/inicio.jsp\"> Regresar al inicio </a>  \r\n");
      out.write("                    </div>                             \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    <footer class=\"text-center\">\r\n");
      out.write("        <div class=\"footer-below\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        Copyright &copy; 2014 - @Karla @Meli\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

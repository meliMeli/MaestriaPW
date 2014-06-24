package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_005fclientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <head>\r\n");
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
      out.write("        <div class=\"container-fluid fondoGris\">\r\n");
      out.write("            <div class=\"row-fluid  div-titulo\">\r\n");
      out.write("                <h3 class=\"span6\">Registrar Cliente </h3>\r\n");
      out.write("                <!--<div class=\"span6\"> <a  href=\"listarAlumnos.html\" class=\" btn btn-info fa-input pull-right\">Volver a Listado</a>   </div>--> \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row-fluid formulario\">\r\n");
      out.write("                <form id=\"frmReghab\" method=\"GET\"  action=\"registroCliente\"  class=\"form-horizontal\">\r\n");
      out.write("                    <fieldset >\r\n");
      out.write("                        <legend><h4>Datos Habitación</h4></legend>\r\n");
      out.write("                        <div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"span6\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <label   class=\"control-label\" for=\"nombre\">Nombres</label>                \r\n");
      out.write("                                    <div class=\"controls\">\r\n");
      out.write("                                        <input id=\"ubicacion\" name=\"nombre\" path=\"nombre\" class=\"input-xlarge\"  type=\"text\"/>\r\n");
      out.write("                                        <!--<form:errors  path=\"nombre\"  cssClass=\"help-block\"/>-->   \r\n");
      out.write("                                    </div>  \r\n");
      out.write("                                </div>  \r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <label  class=\"control-label\"    for=\"apellido\">Apellidos </label>                            \r\n");
      out.write("                                    <div class=\"controls\">\r\n");
      out.write("                                        <input id=\"direccion\" name=\"apellido\" path=\"apellido\" class=\"input-xlarge\" type=\"text\"  />\r\n");
      out.write("                                        <!--<form:errors  path=\"direccion\" cssClass=\"help-block\"/>-->                      \r\n");
      out.write("                                    </div>  \r\n");
      out.write("                                </div>   \r\n");
      out.write("                             </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"span6\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <label class=\"control-label\" for=\"correo\">Correo </label>                            \r\n");
      out.write("                                    <div class=\"controls\">\r\n");
      out.write("                                        <input id=\"celular\" path=\"correo\" class=\"input-large\"   type=\"text\"  />\r\n");
      out.write("                                        <!--<form:errors  path=\"celular\" cssClass=\"help-block\"/>-->      \r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>  \r\n");
      out.write("                    </fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <legend></legend>    \r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row-fluid\">\r\n");
      out.write("                            <div class=\"span12\" style=\"min-height: 50px\">\r\n");
      out.write("                                <span>(*) Todos los campos son obligatorios</span>\r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div> \r\n");
      out.write("                        <div class=\"row-fluid \"> \r\n");
      out.write("                            <div class=\"span12 form-actions\">\r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <div class=\"controls\">\r\n");
      out.write("                                        <input id=\"btnGuardar\" type=\"submit\" class=\"btn btn-info fa-input\" name=\"guardar\" value=\"Guardar\"> &nbsp;                                                                                                               \r\n");
      out.write("                                        <a class=\"btn btn-info fa-input right\" href=\"listahabitaciones.jsp\">Regresar a lista</a>  \r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </fieldset> \r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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

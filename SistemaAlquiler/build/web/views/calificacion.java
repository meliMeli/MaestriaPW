/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calificacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jorge
 */
@WebServlet(name = "calificacion", urlPatterns = {"/calificacion"})
public class calificacion extends HttpServlet {
    
    private String nombre=null;
    private String apellidos=null;
    private String calificacion=null;
    private String comentarios=null;
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        nombre=request.getParameter("nombre");
        apellidos=request.getParameter("apellidos");
        calificacion=request.getParameter("calificacion");
        comentarios=request.getParameter("comentarios");
        PrintWriter out = response.getWriter();       

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>calificacion del servicio web</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>gracias por su información</h2>"); 
            out.println("<p><b>Nombre : </b>"+nombre+"</p>");
            out.println("<p><b>Apellidos : </b>"+apellidos+"</p>");
            //out.println("<p><b>Calificacion : </b>"+calificacion+"</p>");
            String calificacion[] = request.getParameterValues("calificacion");
             for (int i=0;i<calificacion.length;i++) {
                 System.out.println("calificacion "+i+":"+calificacion[i]);
           }
            out.println("<p><b>Comentarios : </b>"+comentarios+"</p>");
            out.println("</body>");
            out.println("</html>");  
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

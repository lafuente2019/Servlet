/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servllet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Valter Lafuente Junior
 */
@WebServlet(name = "Formulario", urlPatterns = {"/formulario"})
public class Formulario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Formulario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Ola  " + nome + " você tem " + idade + " anos " + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}

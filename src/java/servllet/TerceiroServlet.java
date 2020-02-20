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
@WebServlet(name = "TerceiroServlet", urlPatterns = {"/TerceiroServlet", "/terceiroservlet", "/saudacao"})
public class TerceiroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TerceiroServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("Olá " + name + ", seja bem vindo");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

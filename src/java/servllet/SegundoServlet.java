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
@WebServlet(name = "SegundoServlet", urlPatterns = {"/SegundoServlet"})
public class SegundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SegundoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("Nome do servlet ............" + request.getContextPath() + "<br>");
            out.println("Nome maquina local ........ " + request.getLocalName() + "<br>");
            out.println("Endereço da maquina Locl... " + request.getLocalAddr() + "<br>");
            out.println("Porta da maquina local..... " + request.getLocalPort() + "<br>");
            out.println("Endereço do servidor ......." + request.getRemoteHost() + "<br>");
            out.println("Porta do servidor..........." + request.getRemotePort() + "<br>");
            out.println("Metodo de requisição........" + request.getMethod() + "<br>");
            out.println("Protocolo utilizado ........" + request.getProtocol() + "<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

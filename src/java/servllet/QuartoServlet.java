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
@WebServlet(name = "QuartoServlet", urlPatterns = {"/QuartoServlet"})
public class QuartoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        Float salario = Float.parseFloat(request.getParameter("salario"));
        Float percentual = Float.parseFloat(request.getParameter("percentual"));
        Float novoSalario = salario + salario * percentual / 100;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular Salario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Calculo do salário</h1>");
            out.println("nome dp funcionario: " + name + "<br>");
            out.println("salario atual......: R$ " + salario + "<br>");
            out.println("percentual:........: " + percentual + "<br>");
            out.println("novo salario.......: R$ " + novoSalario + "<br>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}

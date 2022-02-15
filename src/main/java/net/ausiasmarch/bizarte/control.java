package net.ausiasmarch.bizarte;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class control extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet control</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HOLA MUNDO: Servlet control en " + request.getContextPath() + "</h1>");
            out.println("<h2>Fuente multilínea!! -> compruebalo</h2>");
            out.println("<h2>Esta es la entrada por defecto a este programa</h2>");
            out.println("<h2>Lo puedes ver en el web.xml</h2>");
            out.println("<a href=\"hola\">Enlace al servlet holamundo</a><br>");
            out.println("<a href=\"index.html\">Enlace a la página index.html</a>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}

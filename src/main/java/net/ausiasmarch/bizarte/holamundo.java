/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.bizarte;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class holamundo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("<html><body>");
            out.print("<h1>Servlet HOLA MUNDO: observa el fuente en una sola línea!</h1>");
            out.print("<a href=\"control\">Ir al servlet control</a><br>");
            out.print("<a href=\"index.html\">Ir a la página index.html</a>");
            out.print("</body></html>");
        }
    }
}

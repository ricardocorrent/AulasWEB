/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rcorrent
 */
public class HttpRequestParameterServlet extends HttpServlet {

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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<header>");
        out.println("<title>");
        out.println("Query string");
        out.println("</title>");
        out.println("</header>");
        out.println("<body>");
        
        Enumeration enumeration = request.getParameterNames();
        while(enumeration.hasMoreElements()){
            String parameter = (String) enumeration.nextElement();
            out.println("parameter: " + request.getParameter(parameter) + "<br/>");
        }
        out.println("<form method=\"GET\">");
        out.println("First Name: <br/>");
        out.println("<input type=\"text\" name=\"firstname\"><br/>");
        out.println("Last Name: <br/>");
        out.println("<input type=\"text\" name=\"lastname\">");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

}

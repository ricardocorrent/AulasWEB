/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rcorrent
 */
public class HttpRequestMultipleParameterServlet extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<header>");
        out.println("<title>Servlet HttpRequestMultipleParameterServlet</title>");
        out.println("</header>");
        out.println("<body>");
        out.println("<h3>Select your favority music</h3>");
        out.println("<form method=\"POST\">");
        out.println("<input type=\"checkbox\" name=\"favoriteMusic\" value=\"Rock\">Rock<br/>");
        out.println("<input type=\"checkbox\" name=\"favoriteMusic\" value=\"Jazz\">Jazz<br/>");
        out.println("<input type=\"checkbox\" name=\"favoriteMusic\" value=\"Classical\">Classical<br/>");
        out.println("<input type=\"checkbox\" name=\"favoriteMusic\" value=\"Country\">Country<br/>");
        out.println("<input type=\"submit\" name=\"submit\" value=\"Submit\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String[] values = request.getParameterValues("favoriteMusic");
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        if(values != null){
            out.println("You have selected:");
            
            for (String value : values) {
                out.println("<br/>" + value);
            }
        }
    }

}

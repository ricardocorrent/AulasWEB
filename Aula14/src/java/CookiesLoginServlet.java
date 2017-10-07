/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rcorrent
 */
public class CookiesLoginServlet extends HttpServlet {

    private void sendLoginForm(HttpServletResponse response, boolean withError) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<header>");
        out.println("<title>Servlet LoginServlet</title>");
        out.println("</header>");
        out.println("<body>");
        if (withError) {
            out.println("Login failled! try again...");
        }
        out.println("<h3>Tela de login</h3>");
        out.println("<form method=\"POST\">");
        out.println("User name: <input type=\"text\" name=\"userName\"><br/>");
        out.println("Password: <input type=\"password\" name=\"password\"><br/>");
        out.println("<input type=\"submit\" name=\"submit\" value=\"Submit\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sendLoginForm(response, false);
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
        String user = request.getParameter("userName");
        String password = request.getParameter("password");

        if (user != null && password != null && user.equals("admin") && password.equals("admin")) {
            Cookie c1 = new Cookie("userName", user);
            Cookie c2 = new Cookie("password", password);
            response.addCookie(c1);
            response.addCookie(c2);
            response.sendRedirect("ContentServlet");
        } else {
            sendLoginForm(response, true);
        }
    }

}

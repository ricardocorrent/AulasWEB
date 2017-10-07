
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcorrent
 */
public class RequestDemoServlet implements Servlet{

    @Override
    public void init(ServletConfig config) throws ServletException {
        
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        String author = req.getParameter("author");
        
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> The Post Method </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("The servlet has received a post . thank you!!");
        out.println("<p>Author: " + author + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

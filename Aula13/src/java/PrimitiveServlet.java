
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcorrent
 */
public class PrimitiveServlet implements Servlet{
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
    
}

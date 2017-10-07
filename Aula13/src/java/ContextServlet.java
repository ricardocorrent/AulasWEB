
import java.io.IOException;
import java.util.Enumeration;
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
public class ContextServlet implements Servlet {

    ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;

    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        ServletContext context = this.getServletConfig().getServletContext();
        Enumeration e = context.getInitParameterNames();
        while (e.hasMoreElements()) {
            String param = (String) e.nextElement();
            System.out.println("param name: " + param);
            System.out.println("param value: " + context.getInitParameter(param));
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy ContextServlet");
    }

}

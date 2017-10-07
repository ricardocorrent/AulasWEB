import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.*;

/**
 *
 * @author rcorrent
 */
public class ReserveConfigServlet implements Servlet{
    
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
        Enumeration params = this.getServletConfig().getInitParameterNames();
        
        while(params.hasMoreElements()){
            String param = (String) params.nextElement();
            System.out.println("Param name: " + param);
            System.out.println("Param value: " + this.getServletConfig().getInitParameter(param));
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy no ReserveConfigServlet");
    }
    
}


import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.*;

/**
 *
 * @author rcorrent
 */
public class ConfigDemoServlet implements Servlet{
    
    
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        Enumeration params = config.getInitParameterNames();
        
        while(params.hasMoreElements()){
            String param = (String) params.nextElement();
            System.out.println("Param name: " + param);
            System.out.println("Param value: " + config.getInitParameter(param));
        }
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service no ConfigDemoServelt");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy no ConfigDemoServlet");
    }
    
}

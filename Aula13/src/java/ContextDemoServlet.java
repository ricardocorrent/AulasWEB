import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.*;

/**
 *
 * @author rcorrent
 */
public class ContextDemoServlet implements Servlet{
    
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
        Enumeration attributes = context.getAttributeNames();
        while(attributes.hasMoreElements()){
            String atribute = (String) attributes.nextElement();
            System.out.println("Attri name: " + atribute);
            System.out.println("Attri value: " + context.getAttribute(atribute));
        }
        System.out.println("Major version " + context.getMajorVersion());
        System.out.println("Minor version " + context.getMinorVersion());
        System.out.println("ServerInfo: " + context.getServerInfo());
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


import java.io.IOException;
import javax.servlet.*;

/**
 *
 * @author rcorrent
 */
public class AttributeSetterServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext context = config.getServletContext();        
        context.setAttribute("password", "dingdong");
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

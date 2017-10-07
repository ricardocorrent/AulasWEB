
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

/**
 *
 * @author rcorrent
 */
public class SimpleServlet extends GenericServlet{
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Extending GenericServlet");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<strong>Extending GenericServlet </strong>make your code simple");
        out.println("</body>");
        out.println("</html>");
    }
}

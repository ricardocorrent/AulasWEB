
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rcorrent
 */
public class ResponseDemoServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("ServletResponse");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<b>Demonstrating the ServletResponseObject</b>");
        out.println("<br>Server Port: " + request.getServerPort());
        out.println("<br>Server Name: " + request.getServerName());
        out.println("<br>Protocol: " + request.getProtocol());
        out.println("<br>Character Encoding: " + request.getCharacterEncoding());
        out.println("<br>Content Type: " + request.getContentType());
        out.println("<br>Content Length: " + request.getContentLength());
        out.println("<br>Remote Address: " + request.getRemoteAddr());
        out.println("<br>Remote Host: " + request.getRemoteHost());
        out.println("<br>Scheme: " + request.getScheme());

        Enumeration parameters = request.getParameterNames();
        while (parameters.hasMoreElements()) {
            String parameterName = (String) parameters.nextElement();
            out.println("<br>Parameters Name:" + parameterName);
            out.println("<br>Parameters Value:"
                    + request.getParameter(parameterName));
        }
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void destroy() {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

}

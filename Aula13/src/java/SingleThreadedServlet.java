
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

/**
 *
 * @author rcorrent
 */
public class SingleThreadedServlet extends GenericServlet{
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        int counter = 0;
        
        try {
            FileReader fr = new FileReader("counter.txt");            
            BufferedReader reader = new BufferedReader(fr);
            
            counter = Integer.parseInt(reader.readLine());
            fr.close();
        } catch (Exception e) {
        }
        counter++;
        
        System.out.println("counter: " + counter);
        
        try {
            Thread.sleep(6000);            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("counter.txt"));
            write.write(Integer.toString(counter));
            write.close();
        } catch (Exception e) {
        }
    }
}

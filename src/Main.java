import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 *
 * @author GK_L2
 */
public class Main extends HttpServlet {
    @Override
    protected void doGet ( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.getWriter().print("Hello World!");
    }
    
}
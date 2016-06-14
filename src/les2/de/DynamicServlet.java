package les2.de;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Lars der Polo on 19-May-16.
 */
public class DynamicServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String name = req.getParameter("username");
        PrintWriter out = resp.getWriter();

        resp.setContentType("text/html");

        out.println("Hello " + name);

    }

}

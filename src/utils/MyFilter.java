package utils;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by larsd on 20-May-16.
 */
public class MyFilter implements Filter {

    public void init(FilterConfig arg0) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;

        if(request.getSession().getAttribute("loggedUser") == null) {
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            return;
        }else {
            chain.doFilter(req, resp);
        }
    }

    public void destroy() {

    }
}

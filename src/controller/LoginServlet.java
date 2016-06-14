package controller;

import model.BlogService;
import model.ServiceProvider;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by larsd on 20-May-16.
 */
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        BlogService blogService = ServiceProvider.getBlogService();

        HttpSession session = req.getSession();
        RequestDispatcher rd = null;

        User user = blogService.loginUser(username, password);

        if(user != null) {
            session.setAttribute("loggedUser", user);

            rd = req.getRequestDispatcher("/blogger/myaccount.jsp");

            Cookie userCookie = new Cookie("username", user.getUsername());
            resp.addCookie(userCookie);
        }
        else {
            req.setAttribute("msg", "Username and/or password is wrong");
            rd = req.getRequestDispatcher("index.jsp");
        }

        rd.forward(req,resp);

    }

}

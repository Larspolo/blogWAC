package controller;

import model.BlogService;
import model.ServiceProvider;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by larsd on 20-May-16.
 */
public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = ((req.getParameter("password").equals(req.getParameter("repeat"))) ? req.getParameter("password") : null);
        String email = req.getParameter("email");
        String name = req.getParameter("name");

        BlogService blogService = ServiceProvider.getBlogService();

        RequestDispatcher rd = null;

        if(blogService.registerUser(username, password, email, name) == true) {
            rd = req.getRequestDispatcher("welcome.jsp");
        }else {
            req.setAttribute("msg", "Please fill everything in correctly");
            rd = req.getRequestDispatcher("register.jsp");
        }

        rd.forward(req, resp);

    }

}

package controller;

import model.BlogService;
import model.ServiceProvider;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by larsd on 20-May-16.
 */
public class BlogPostServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String subject = req.getParameter("subject");
        String text = req.getParameter("text");

        BlogService blogService = ServiceProvider.getBlogService();

        HttpSession session = req.getSession();

        User user = (User) session.getAttribute("loggedUser");
        try {
            blogService.addBlogForUser(subject, text, user);
        }
        catch(IllegalArgumentException e) {
            req.setAttribute("msg", e);
        }

        RequestDispatcher rd = req.getRequestDispatcher("/blogger/myaccount.jsp");

        rd.forward(req, resp);

    }

}

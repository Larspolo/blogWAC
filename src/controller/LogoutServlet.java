package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

/**
 * Created by larsd on 20-May-16.
 */
public class LogoutServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        session.removeAttribute("loggedUser");

        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");

        rd.forward(req, resp);

    }

}

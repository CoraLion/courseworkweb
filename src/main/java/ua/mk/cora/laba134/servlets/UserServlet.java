package ua.mk.cora.laba134.servlets;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.mk.cora.laba134.dao.UserDAO;
import ua.mk.cora.laba134.enities.UsersEntity;

import java.io.IOException;
import java.util.List;


public class UserServlet extends HttpServlet {

    @EJB
    UserDAO usdao;


    public void  processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<UsersEntity> userall = usdao.findAll();
        request.setAttribute("usersall", userall);
        getServletContext().getRequestDispatcher("/user.jsp").forward(request, response);
    }

}

package ua.mk.cora.laba134.servlets;

import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.mk.cora.laba134.email.EmailContext;

import java.io.IOException;
import java.util.ArrayList;


public class ContactServlet extends HttpServlet {

    private String host;
    private String port;
    private String user;
    private String pass;
    private String encoding;


    public void init() {
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String recipient = request.getParameter("email");
        String subject = request.getParameter("name");
        String content = request.getParameter("textfoulder");
        try {
            EmailContext.sendEmail(host, port, user, pass, recipient, subject,
                    content);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

}

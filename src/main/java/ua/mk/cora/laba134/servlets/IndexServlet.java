package ua.mk.cora.laba134.servlets;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.mk.cora.laba134.dao.HorseDAO;
import ua.mk.cora.laba134.dao.WorkersDAO;
import ua.mk.cora.laba134.enities.*;

import java.io.IOException;
import java.util.List;

public class IndexServlet  extends HttpServlet {
    @EJB
    WorkersDAO wdao;
    @EJB
    HorseDAO hdao;

    public void  processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<HorseEntity> htop = hdao.findTop();
        List<WorkersEntity> work = wdao.findSch();
        request.setAttribute("schwork", work);
        request.setAttribute("horsetop",htop);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

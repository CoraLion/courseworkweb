package ua.mk.cora.laba134.servlets;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.mk.cora.laba134.dao.WorkersDAO;
import ua.mk.cora.laba134.enities.WorkersEntity;

import java.io.IOException;
import java.util.List;


public class TrainerServlet extends HttpServlet
{
    @EJB
    WorkersDAO wdao;

    public void  processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<WorkersEntity> trainone = wdao.findOneTrain();
        List<WorkersEntity> traintwo = wdao.findTwoTrain();
        List<WorkersEntity> trainthree = wdao.findThreeTrain();
        List<WorkersEntity> trainfour = wdao.findFourTrain();
        request.setAttribute("trainone", trainone);
        request.setAttribute("traintwo", traintwo);
        request.setAttribute("trainthree", trainthree);
        request.setAttribute("trainfour", trainfour);
        getServletContext().getRequestDispatcher("/trainers.jsp").forward(request, response);
    }
}

package ua.mk.cora.laba134.servlets.horseservlets;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.mk.cora.laba134.dao.HorseDAO;
import ua.mk.cora.laba134.enities.HorseEntity;
import java.io.IOException;
import java.util.List;

public class BreedHorseServlet extends HttpServlet {

    @EJB
    HorseDAO hdao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<HorseEntity> hlist = hdao.findBreed();
        request.setAttribute("hlist", hlist);
        getServletContext().getRequestDispatcher("/horseall.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

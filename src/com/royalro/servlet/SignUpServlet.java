package com.royalro.servlet;

import com.royalro.service.UserAuthentication;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserAuthentication ua = new UserAuthentication();
        ua.createLogin("y@w.com","hhiu");
        ua.createLogin("y@w.com","hhiu");
        ua.createLogin("y@w.com","hhiu");
        ua.createLogin("y@w.com","hhiu");
        ua.createLogin("y@w.com","hhiu");
        ua.createLogin("y@w.com","hhiu");
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

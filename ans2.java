package com.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ans2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String answer1 = request.getParameter("ans1");
        String answer2 = request.getParameter("q2");
        out.print("Question 1 answer : " + answer1);
        out.print("<br>Question 2 answer : " + answer2);

        RequestDispatcher rd1 = request.getRequestDispatcher("/Score");
        rd1.forward(request, response);

    }
}

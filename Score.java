package com.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Score extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        RequestDispatcher rd1 = request.getRequestDispatcher("/index.html");
        rd1.include(request, response);

        String answer1 = request.getParameter("ans1");
        String answer2 = request.getParameter("q2");
        String messageAns1, messageAns2;
        int totalScore = 0;

        if (answer1.equals("a2")) {
            messageAns1 = "  :) Your Response is correct!!!";
            totalScore++;
        } else {
            messageAns1 = "    :( Oops!!! wrong option selected. Correct answer is [b. forward()]";
        }

        if (answer2.equals("a4")) {
            messageAns2 = " :) Your Response is correct!!!";
            totalScore++;
        } else {
            messageAns2 = " :( Oops!!! wrong option selected. Correct answer is [d. All mentioned above]";
        }
        out.print("<h1>**Score Board**</h1>");
        out.print("<h2>You scored  " + totalScore + "/2</h2>");
        out.print("<br>Question 1 answer : " + answer1);
        out.print("<br>" + messageAns1);
        out.print("<br><br>Question 2 answer : " + answer2);
        out.print("<br>" + messageAns2);
    }

}

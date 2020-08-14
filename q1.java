package com.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class q1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Question 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form  action= 'ans1' method='post'>");
            out.println("<h1>Question 1 : </h1>");
            out.println("<h3>Which method is used to send the same request and response objects to another servlet in RequestDispacher ?</h3>");

            out.println("<input type='radio' id='a1' name='q1' value='a1'>");
            out.println("<label for='a1'>a. sendRedirect()</label><br>");

            out.println("<input type='radio' id='a2' name='q1' value='a2'>");
            out.println("<label for='a2'>b. forward()</label><br>");

            out.println("<input type='radio' id='a3' name='q1' value='a3'>");
            out.println("<label for='a3'>c. Both A & B</label><br>");

            out.println("<input type='radio' id='a4' name='q1' value='a4'>");
            out.println("<label for='a4'>d. None of the above</label><br>");

            out.println("<input type='submit' value=' Next >>'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        processRequest(request, response);
    }

}

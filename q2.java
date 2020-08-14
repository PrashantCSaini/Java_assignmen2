package com.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class q2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Question 2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form  action='ans2' method='post'>");
            out.println("Question 1 answer is : <input type='text'  name='ans1' value='" + request.getParameter("q1") + "'></input><br>");
            out.println("<h1>Question 2 : </h1>");
            out.println("<h3>What is the lifecycle of a servlet?</h3>");
            out.println("<input type='radio' id='a1' name='q2' value='a1'>");
            out.println("<label for='a1'>a. Servlet class is loaded</label><br>");

            out.println("<input type='radio' id='a2' name='q2' value='a2'>");
            out.println("<label for='a2'>b. Servlet instance is created</label><br>");

            out.println("<input type='radio' id='a3' name='q2' value='a3'>");
            out.println("<label for='a3'>c. init,Service,destroy method is invoked</label><br>");

            out.println("<input type='radio' id='a4' name='q2' value='a4'>");
            out.println("<label for='a4'>d. All mentioned above</label><br>");

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
        PrintWriter out = response.getWriter();

        processRequest(request, response);
    }
}

package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-submit")
public class ContactMeServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String firstName = request.getParameter("Fname");
    String lastName = request.getParameter("Lname");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String feedback = request.getParameter("Fb");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + firstName);
    System.out.println("You submitted: " + lastName);
    System.out.println("You submitted: " + email);
    System.out.println("You submitted: " + phone);
    System.out.println("You submitted: " + feedback);


    // Write the value to the response so the user can see it.
    response.sendRedirect("http://smatias-sps-summer21.appspot.com/contactMe.html");
  }
}

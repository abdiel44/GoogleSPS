package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/fetch")

public class FetchServlet extends HttpServlet 
{
  private int buttonPresses = 0;
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      buttonPresses++;
    response.setContentType("text/html;");
    response.getWriter().println("Hello Steven");
    response.getWriter().println("In this case the Servlets were called through JavaScript and the information was embedded in the HTML.");
    response.getWriter().println("This button has been pressed " + buttonPresses + " times.");
  }
}

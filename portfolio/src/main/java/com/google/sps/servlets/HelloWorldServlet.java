package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
private int pageViews = 0;
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      pageViews ++;
    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello Steven</h1>");
     response.getWriter().println("<p>Each time you reload this screen you will see the value at the bottom of the screen increase. This is 100% generated from what I learned about Servlets.</p>");
    response.getWriter().println("<p>This page has been viewed " + pageViews + " times.</p>");
  }
}

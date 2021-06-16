package com.google.sps.servlets;

import com.google.sps.data.JsonData;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/json")
public final class JsonDataServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String brand = "Toyota";
    String model = "Corolla";
    String color = "Red";
    int year = 2019;

    // Convert the jsonData to JSON
    JsonData jsonData = new JsonData(Brand,Model,Color,Year);

    String jsonUsingGson = convertToJsonUsingGson(jsonData);

    // Send the JSON as the response
    response.setContentType("application/json");
    response.getWriter().println(jsonUsingGson);
  }

  /**
   * Converts a JsonData instance into a JSON string using the Gson library. Note: We first added
   * the Gson library dependency to pom.xml.
   */
  private String convertToJsonUsingGson(JsonData jsonData) {
    Gson gson = new Gson();
    String json = gson.toJson(jsonData);
    return json;
  }
}

package org.ex.jsp.board.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.ex.jsp.board.Rq;

import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req, resp);
    int num = rq.getIntParam("num", 1);
    resp.getWriter().append("<h1>%d</h1>\n".formatted(num));
  }
}

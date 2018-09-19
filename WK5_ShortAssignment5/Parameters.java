/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicho
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class startParam
 */
@WebServlet(
		urlPatterns = { "/startParam" }, 
		initParams = { 
				@WebInitParam(name = "paramOne", value = "First Parameter"), 
				@WebInitParam(name = "paramTwo", value = "Second Paramter"), 
				@WebInitParam(name = "paramThree", value = "Third Parameter"),
				@WebInitParam(name = "paramFour", value = "Fourth Parameter")
		})
public class Parameters extends HttpServlet {
 
 protected void doGet(
   HttpServletRequest request, 
   HttpServletResponse response
   ) throws ServletException, IOException {
 
  response.setContentType("text/html");
 
  PrintWriter out = response.getWriter();
 
  try {
   out.println("<html>");
   out.println("<body>");
   out.println("<h1>Hello " + getServletConfig().getInitParameter("paramOne")  + "</h1>");
   out.println("<h1>Hello " + getServletConfig().getInitParameter("paramTwo")  + "</h1>");
   out.println("<h1>Hello " + getServletConfig().getInitParameter("paramThree")  + "</h1>");
   out.println("<h1>Hello " + getServletConfig().getInitParameter("paramFour")  + "</h1>");
   out.println("</body>");
   out.println("</html>");
  } finally {
   out.close();
  }
 
 }
 
}
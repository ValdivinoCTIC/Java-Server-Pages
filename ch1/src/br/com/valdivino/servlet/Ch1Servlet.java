package br.com.valdivino.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch1Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
        java.util.Date today = new java.util.Date();
        out.println("<html>" + 
                        "<body> " +
                         "<h1 align=center> HF´s Chapter1 Servlet</h1>" +
                         "<br>" + today + 
                         "</body>" +
                    "</html>");
	}
}

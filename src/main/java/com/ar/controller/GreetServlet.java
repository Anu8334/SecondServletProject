package com.ar.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description ="test servlet",urlPatterns="/greet")
public class GreetServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
//		PrintWriter out=res.getWriter();
//		res.setContentType("Text/Html");
//		out.println("<h1>Greet from Test Servlet</h1>");
		String myName = req.getParameter("name");
//		out.println("<h2>Hello! "+myName+"</h2>");
//		LocalTime currentTime = LocalTime.now();
//		out.println("<h3>It is now "+currentTime+"</h3>");
//		LocalDate currentDate = LocalDate.now();
//		out.println("<h3>It is now "+currentDate+"</h3>");
//		out.close();
		
		req.setAttribute("name", myName);
		RequestDispatcher rd = req.getRequestDispatcher("Greet.jsp");
		rd.forward(req, res);
	}
	
}

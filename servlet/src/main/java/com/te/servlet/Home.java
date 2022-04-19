package com.te.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import javax.servlet.GenericServlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//
//public class Home extends GenericServlet {
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		PrintWriter writer = res.getWriter();
//		String parameter = req.getParameter("username");
//		writer.println("<h1> welcome "+parameter+"</h1>");
//		
//	}

public class Home extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String parameter = req.getParameter("username");
		writer.println("<h1> welcome "+parameter+"</h1>");
	}
	

}

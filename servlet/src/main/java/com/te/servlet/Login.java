package com.te.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class Login extends GenericServlet {
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		PrintWriter writer = res.getWriter();
//		writer.println("<h1>login form</h1>");
//		writer.println("<form action='./home'>"
//				+ "<input type='text' name='username' placeholder=usernmae> <br>"
//				+ "<input type='text' name='password' placeholder=password> <br>"
//				+ "<input type='submit' value='submit' >"
//				+ "</form>");
//		
//		
//	}
//
//}
public class Login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>login form</h1>");
		writer.println("<form action='./home' method='post'>"
				+ "<input type='text' name='username' placeholder=usernmae> <br>"
				+ "<input type='text' name='password' placeholder=password> <br>"
				+ "<input type='submit' value='submit' >"
				+ "</form>");
	}
	
}






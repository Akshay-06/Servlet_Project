package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

//	 We can control the post and get request.
//	 If we want to handle only post request then method is doPost
//	 If we want to handle only get request then method is doGet
//	 service method works for both get and post methods

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		int result = num1 + num2;

		// Setting the value for attribute in req to send to next servlet
		req.setAttribute("number", result);

		// Calling the other servlet and passing req and res.
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);

//		PrintWriter out = res.getWriter();
//		out.println(result);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		int result = num1 - num2;

		res.sendRedirect("square?result=" + result); // This method is called URL Rewriting

	}
}
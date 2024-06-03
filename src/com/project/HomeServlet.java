package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {

	// The sendRedirect method of HttpServletResponse always results in a GET
	// request to the redirected URL because it tells the client to make a new
	// request to the provided URL, which defaults to a GET request.
	// So I'm making the below method as service not doPost
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session = req.getSession();
		ServletConfig conf = getServletConfig();

		String uname = (String) session.getAttribute("username");
		String pass = (String) session.getAttribute("password");

		PrintWriter out = res.getWriter();
		out.println("<h1>"+ conf.getInitParameter("CompanyName") +"</h1>");
		out.println("Welcome to the home page " + uname);

	}
}
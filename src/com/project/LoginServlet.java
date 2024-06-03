package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");

		if (uname.equals("Akshay") && pass.equals("Akshay")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("password", pass);

			res.sendRedirect("home");
			// I have noticed that sendRedirect() method would always end up in the doGet
			// method of the redirected page.

		} else {
			PrintWriter out = res.getWriter();
			out.println("Invalid Credentials");
		}
	}
}

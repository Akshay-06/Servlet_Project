package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");

		Cookie cookie = new Cookie("name", name);
		res.addCookie(cookie);
		
		cookie = new Cookie("password",pass);
		res.addCookie(cookie);
		

		cookie = new Cookie("username",uname);
		res.addCookie(cookie);

		cookie = new Cookie("email",email);
		res.addCookie(cookie);
		
		res.sendRedirect("landing");
		
		

		
	}
}
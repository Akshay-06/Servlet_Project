package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LandingServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {


		Cookie cookies[] = req.getCookies();
		PrintWriter out = res.getWriter();
		
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("name")){
				out.println("Thank you for registering with us "+cookie.getValue());
				out.println("Please verify your details below");
			}
			else {
				out.println(cookie.getName()+" : "+cookie.getValue());
			}
		}
		
		

		
	}
}
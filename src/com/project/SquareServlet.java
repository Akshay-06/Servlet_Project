package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int num = (int) req.getAttribute("number");

		int result = num * num;

		PrintWriter out = res.getWriter();
		out.println("Result is " + result);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int num = Integer.parseInt(req.getParameter("result"));

		int result = num * num;

		PrintWriter out = res.getWriter();
		out.println("Result is " + result);
	}

}
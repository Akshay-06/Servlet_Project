package com.project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;

/**
 * Servlet implementation class FileUploadServlet
 */
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Collection<Part> parts = request.getParts();
	    for (Part part : parts) {
	        part.write("/Users/akshaynarra/Downloads/eclipse-workspace/Servlet_Project/fileupload/"+part.getSubmittedFileName());
	     }
	     response.getWriter().print("The file has been uploaded successfully.");

	}

}

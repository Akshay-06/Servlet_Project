package com.project;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet Filter implementation class StudentFilter
 */
public class StudentFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, jakarta.servlet.ServletException {
		// TODO Auto-generated method stub
		
//		System.out.println("In filter");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String name = req.getParameter("name");
//        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();

        if (name != null && name.length() > 3) {
            // Pass the request along the filter chain
            chain.doFilter(request, response);
        } else {
            out.println("<html><body>");
            out.println("<h3>Make sure the name contains more than 3 characters</h3>");
            out.println("</body></html>");
        }
		
	
	}

}

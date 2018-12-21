package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    
	public void destroy() {
		System.out.println(">> destroy executed");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // to write response
		
		
		// Before we pass request to Servlet, filter is going to validate the data
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		out.print("<h4>** pre processing ** </h4>");

		if(email.isEmpty() || password.isEmpty()){
			out.print("<h4>>> Email and Password Required <</h4>");
		}else{
			// pass the request along the filter chain
			chain.doFilter(request, response); // pass request to corresponding Servlet
		}
		
		out.print("<h4>** post processing **</h4>");
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(">> init executed");
	}

}

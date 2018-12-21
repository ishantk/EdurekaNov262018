package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontController", "/Front" })
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String htmlResponse = "<html><body><center><br/><h3/>Hello from Front Controller</h3></center></body></html>";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(htmlResponse); 	// Writing back respone by FrontController
		
		// Extracting type from Request Object
		String type = request.getParameter("type");
		
		String action = "";
		
		if(type.equals("Register Me")){
			action = "Register"; // URL Mapping
		}else{
			action = "Login";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(action);
		dispatcher.forward(request, response); // Response from FrontController is not shared back to the client
		//dispatcher.include(request, response);   // Response from FrontController is appended with corresponding Servlet to the client
		
	}

}

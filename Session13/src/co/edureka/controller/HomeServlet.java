package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = new Date();
		String dateTime = date.toString();
		
		String name = "",email="",age="";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter is to send back the response to client
		
		
		// Reading All the Cookies as an array !!
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
			
			if(ck.getName().equals("keyName")){
				name = ck.getValue();
			}
		}*/
		
		// Reading data from URL 	 : As we do it in Get Request !!
		// Reading data from Request : As we do it in Post Request !!
		/*name = request.getParameter("name");
		email = request.getParameter("keyEmail");
		age = request.getParameter("age");*/
		
		// Read data from HttpSession Object
		HttpSession session = request.getSession();
		name = (String)session.getAttribute("keyName");
		email = (String)session.getAttribute("keyEmail");
		int iAge = (int)session.getAttribute("keyAge");
		
		//int iAge = Integer.parseInt(age); // String to Integer
		
		
		String htmlResponse = "<html><body><center><br/><br/><h3/>Welcome, "+name+"<br/>"+email+"<br/>"+iAge+"</h3><br/><br/> Its: "+dateTime+"</center></body></html>";
		
		out.print(htmlResponse);	
	}

}

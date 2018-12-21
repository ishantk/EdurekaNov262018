package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	// doPost is executed only and only in case request method is post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. Extra Data from Client's Request
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// we have data available in user object i.e. temporary
		//2. Save the data in the Table in Database i.e. Persistance
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean result = helper.loginUser(user);
		helper.closeConnection();
		
		//3. Send a Dynamic Response to the Client
		String msg = "";
		
		// Data which we wish to share with other web resources !!
		String name = "John Watson";
		int age = 30;
		
		if(result){
			
			// Session Tracking
			
			// 1. Cookies
			// Saved on Browser i.e. Client Side !! (User must not have disabled cookies in browser)
			/*Cookie ck1 = new Cookie("keyName",	name);
			Cookie ck2 = new Cookie("keyEmail",	user.email);
			Cookie ck3 = new Cookie("keyAge", String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			// 2. URL Rewriting
			//String url = "HomeServlet?name="+name+"&keyEmail="+user.email+"&age="+age;
			
			//msg = "<h3>"+user.email+" Logged In Successfully !!</h3><br/>"
			//		+ "<a href='"+url+"'>Enter Home</a>";
			
			// 3. Hidden form Fields
			/*msg = "<form action='HomeServlet' method='post'>"
					+ "<input type='hidden' name='name' value='"+name+"'/>"
					+ "<input type='hidden' name='keyEmail' value='"+user.email+"'/>"
					+ "<input type='hidden' name='age' value='"+age+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";*/
			
			msg = "<h3>"+user.email+" Logged In Successfully !!</h3><br/>"
						+ "<a href='HomeServlet'>Enter Home</a>";
			
			// 4. HttpSession Object
			HttpSession session = request.getSession();
			session.setAttribute("keyName",name);
			session.setAttribute("keyEmail",user.email);
			session.setAttribute("keyAge",age); // Type shall be maintained !!
			
		}else{
			msg = "<h3>"+user.email+" Not Logged In Successfully !!</h3>";
			//response.sendRedirect("https://www.google.co.in");
		}
		
		String htmlResponse = "<html><body><center><br/><h3/>Welcome to LMS</h3><br/><br/>"+msg+"</center></body></html>";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter is to send back the response to client
		out.print(htmlResponse);	
	}

}

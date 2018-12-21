package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	// Executed when object of Servlet is created by WebServer eg: Tomcat in our case
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> init executed");
	}
	
	// Executed when object of Servlet is no longer required by Server
	public void destroy() {
		System.out.println(">> destroy executed");
	}

	// Executed everytime when client sends request
	// request method can be any method i.e. get or post
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> service executed");
		
		//1. Extra Data from Client's Request
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// we have data available in user object i.e. temporary
		//2. Save the data in the Table in Database i.e. Persistance
		/*JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int result = helper.registerUser(user);
		helper.closeConnection();
		
		//3. Send a Dynamic Response to the Client
		String msg = "";
		
		if(result>0){
			msg = "<h3>"+user.name+" Registerd Successfully !!</h3>";
		}else{
			msg = "<h3>"+user.name+" Not Registerd Successfully !!</h3>";
		}*/
		
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		transaction.begin();
		
		session.save(user);
		
		transaction.commit();
		
		String msg = "Transaction Finished";
		
		String htmlResponse = "<html><body><center><h3/>Welcome to LMS</h3><br/><br/>"+msg+"</center></body></html>";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter is to send back the response to client
		out.print(htmlResponse); 				// Writes back the response to the client
		
	}

}

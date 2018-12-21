<%@ page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" %> 
<%@ include file="header.jsp" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	

	<center>

	<h3>Logging in ${ param.txtEmail } .....</h3>

	<%
		// 1. Extract Data from Client
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// 2. Save Data in Table
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean check = helper.loginUser(user);
		helper.closeConnection();
		
		String name = "George";
		int age = 30;
		
		if(check){
			
			// Session Tracking in JSP !!
			/*Cookie ck1 = new Cookie("keyName",name);
			Cookie ck2 = new Cookie("keyEmail",user.email);
			Cookie ck3 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			// URL ReWriting
			// Hidden Form Fields
			
			// HttpSession Object
			session.setAttribute("keyName",name);
			session.setAttribute("keyEmail",user.email);
			session.setAttribute("keyAge",age);
			
			
			//pageContext.setAttribute("keyName",name, PageContext.SESSION_SCOPE);
			
			
	%>
			<h3><%= user.email%> Logged In Successfully !!</h3>
			<!-- <a href="welcome.jsp">Enter Home</a> -->
			<jsp:forward page="welcome.jsp"/>
	<%		
		}else{
			response.sendRedirect("https://www.google.co.in");
    %>
    		<h3><%= user.email%> Not Logged In Successfully !!</h3>
    <%		
		}
	%>
	
	<jsp:include page="header.jsp"/>
	
	</center>

</body>
</html>
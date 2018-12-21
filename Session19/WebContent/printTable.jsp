<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// JSP Page is expecting number in the request object as sent by client
	// Accepts a number and sends back table of a number
	String data = request.getParameter("number");
	try{
		// Convert String into Integer
		int number = Integer.parseInt(data);
		
		for(int i=1;i<=10;i++){
			out.print("<center><b>"+number+" "+i+"'s are "+(number*i)+"</b><br/></center>");
		}
		
	}catch(Exception e){
		out.print("<center><h3>Please Enter a Valid Number !!</h3></center>");
	}
%>    

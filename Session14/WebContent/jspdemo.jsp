<%@ page import="co.edureka.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorhandler.jsp" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 
<%@ page isThreadSafe="true" %> <!--  Synchornized -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>

<center>
		
		<br/><br/>
		
		<h3>Welcome to JSP Page</h3>
		
		<h4>PI is: <% out.print(pi); %></h4>
		<%-- <h4>a is: <% out.print(a); %></h4> error --%>
		
		Sriptlet Tag Demo:
		<br/>
		<%
			int a = 10;
			int b = 20;
			int c = a+b;
			out.print("c is: "+c);
		%>
		
		<%-- <h4>a is: <% out.print(a); %></h4>  works here--%>
		
		<br/>
		Declarative Tag Demo:
		<br/>
		<%!
			double pi = 3.14;
			double areaOfCircle(double radius){
				double area = pi * radius * radius;
				return area;
			}
		%>
		
		<h4>PI is: <% out.print(pi); %></h4>
		<h4>Area of Circle with Radius 3.3 is: <% out.print(areaOfCircle(3.3)); %></h4>
		
		<br/>
		Expression Tag Demo:
		<br/>
		<h4>PI is: <%= pi %></h4>
		<h4>Area of Circle with Radius 4.4 is: <%= areaOfCircle(4.4) %></h4>
		
		<%
			int[] arr = {10,20,30,40,50};
		%>
		<h3>arr[0] is: <%= arr[0] %></h3>
		
		<%
			// Object Construcion
			Student s1 = new Student();
			s1.setRoll(101);
			s1.setName("John");
			s1.setAddrrss("Redwood Shores");
		%>
		<h3><%= s1.getRoll() %> belongs to <%= s1.getName() %> and lives in <%= s1.getAddrrss() %> </h3>
		
		<jsp:useBean id="s2" class="co.edureka.model.Student"/>
		<jsp:setProperty property="roll" name="s2" value="201"/>
		<jsp:setProperty property="name" name="s2" value="Jennie"/>
		<jsp:setProperty property="addrrss" name="s2" value="Pristine Magnum"/>
		
		<h3><jsp:getProperty name="s2" property="roll"/> belongs to <jsp:getProperty name="s2" property="name"/> and lives in <jsp:getProperty name="s2" property="addrrss"/> </h3>
		
		<c:forEach var="i" begin="1" end="10">
			<b><c:out value="${i}"/><br/></b>
		</c:forEach>
		
		<%-- <c:redirect url="https://www.google.co.in"/> --%>
		
		<c:set var="age" value="20"/>
		
	</center>

</body>
</html>
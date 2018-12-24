<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REST Client</title>
</head>
<body>

	<center>
		<br/><br/>
		<h3>Jersey REST Client Demo</h3>
	
		<%
			// Lets write Client Code to access our Web Service
			ClientConfig cConfig = new ClientConfig();
			Client client = ClientBuilder.newClient(cConfig); 
			
			// Send Request to WebService
			WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session21A").build());
								//   /rest/hello -> Request to our WebService Hello
			String plainRespone = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			String htmlRespone = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
			String xmlRespone = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
			String jsonRespone = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		%>
	
		Plain Response: <%= plainRespone %> <br/>
		HTML Response: <%= htmlRespone %> <br/>
		XML Response: <%= xmlRespone %> <br/>
		JSON Response: <%= jsonRespone %> <br/>
		
	
	</center>

</body>
</html>
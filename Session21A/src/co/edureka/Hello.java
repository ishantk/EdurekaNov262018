package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// import org.glassfish.jersey.servlet.ServletContainer;

@Path("/hello")			// URL Pattern
public class Hello {  	// Web Service
	
	
	// Web Methods
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){
		String response = "This is a plain hello from Web Service";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		String response = "<html><body><h3>This is HTML hello from Web Service</h3></body></html>";
		return response;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		String response = "<?xml version='1.0' encoding='UTF-8'?><hello>This is XML hello from Web Service</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		String response = "{'name':'John','age':30,'phone':'+91 99999 88888','message':'JSON Hello from Web Service'}";
		return response;
	}
}


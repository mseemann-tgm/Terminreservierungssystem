package com.appel;

/**
 * @author Crunchify.com
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/terminServer")
public class TerminServer {
	@GET
	@Produces("application/xml")
	public String getLogin() {
 
		String loginNameNull = "No Name given";
		
 
		String result = "@Produces(\"application/xml\") Output: \n\n LoginName: \n\n" + loginNameNull;
		return "<ctofservice>" + "<loginName>" + result + "</loginName>" + "</ctofservice>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String getLoginfromInput(@PathParam("c") String c) {
		
		String loginName = c;
		
 
		String result = "@Produces(\"application/xml\") Output: \n\nLoginName: \n\n" + loginName;
		return "<ctofservice>" + "<loginName>" + result + "</loginName>" + "</ctofservice>";
	}
}

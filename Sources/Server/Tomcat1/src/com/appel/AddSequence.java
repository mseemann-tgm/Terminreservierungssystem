package com.appel;

/**
 * @author Crunchify.com
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/addSequence")
public class AddSequence {
	@GET
	@Produces("application/xml")
	public String convertCtoAddition() {
		int[] zahlen = new int[3];
		zahlen[0]=1;
		zahlen[1]=2;
		zahlen[2]=3;
		int ausgabe = zahlen[0]+zahlen[1]+zahlen[2];
		
 
		String result = "@Produces(\"application/xml\") Output: \n\n Addieren Output: \n\n"+ausgabe;
		return "<ctofservice>" + "<eingabe>" + zahlen[0] +"+"+ zahlen[1] +"+"+ zahlen[2] + "</eingabe>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoAddition(@PathParam("c") String c) {
		String x = c;
		String[] getrennt = x.split(",");
		int ausgabeDyn = 0;
		try {
			for(int i=0;i<getrennt.length;i++) {
				ausgabeDyn += Integer.parseInt(getrennt[i]);
			}
		}catch(Exception e) {};
		//int ausgabe = Integer.parseInt(getrennt[0])+Integer.parseInt(getrennt[1]);
 
		String result = "@Produces(\"application/xml\") Output: \n\n Addieren Output: \n\n" + ausgabeDyn;
		return "<ctofservice>" + "<eingabe>" + x + "</eingabe>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}
package com.appel;

/**
 * @author Crunchify
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/subSequence")
public class SubSequence {
	int ausgabeDyn;
	  @GET
	  @Produces("application/json")
	  public Response convertSubtraktion() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		
		
		int[] zahlen = new int[3];
		zahlen[0]=3;
		zahlen[1]=2;
		zahlen[2]=1;
		//jsonObject.put("Zahl 1", zahlen[0]);
		//jsonObject.put("Zahl 2", zahlen[1]);
		//jsonObject.put("Zahl 3", zahlen[2]);
		int ausgabe = zahlen[0]-zahlen[1]-zahlen[2];
		jsonObject.put("Sequence", zahlen);
		jsonObject.put("Ergebnis", ausgabe);
		
 
		String result = "@Produces(\"application/json\") Output: \n\nSubtraktion Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
 
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertSubtraktion(@PathParam("f") String f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		String x = f;
		String[] getrennt = x.split(",");
		try {
		ausgabeDyn = Integer.parseInt(getrennt[0]);
		
			for(int i=1;i<getrennt.length;i++) {
				ausgabeDyn -= Integer.parseInt(getrennt[i]);
			}
		}catch(Exception e){};
		jsonObject.put("Sequence", getrennt); 
		jsonObject.put("Ergebnis", ausgabeDyn);
 
		String result = "@Produces(\"application/json\") Output: \n\nSubtraktion Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}

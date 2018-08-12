package com.vishnu.restful_webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.vishnu.domine.Message;
import com.vishnu.domine.StudentData;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
  /* @POST 
   @Path("/{id}")
   @Produces({MediaType.APPLICATION_JSON})
   @Consumes(MediaType.APPLICATION_JSON)
   public Message RegisterDetails(StudentData data,@Context HttpHeaders headers,@PathParam("id") String id) {
	   
	   MultivaluedMap<String,String> valueMap = headers.getRequestHeaders();
	   
	   System.out.println("Header map::"+valueMap.toString());
	   
	   Message message = new Message();
	   message.setMessage(id);
	   message.setTrace("001");	   
	   return message;
   } */
   
   @POST 
   @Path("/register/{id}")
   @Produces({MediaType.APPLICATION_JSON})
   @Consumes(MediaType.APPLICATION_JSON)
   public Message RegisterDetails_f(StudentData data,@Context HttpHeaders headers,@DefaultValue("No value or ID") @PathParam("id") String id,@QueryParam("pwd") String number) {
	   
	   Message message = new Message();
	   
	   if(number.equalsIgnoreCase("000")) {
		   message.setMessage("You are a stranger");
	   } else {
		   MultivaluedMap<String,String> valueMap = headers.getRequestHeaders();   
		   System.out.println("Header map::"+valueMap.toString());
    	   message.setMessage(id);
		   message.setTrace("001");	   
	   }   
	   return message;
   }
   
   @Path("nmd")
   public String returnMessage() {
	   return "No resource method designators";
   }
}

package com.restclienttest.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.restclienttest.logic.RestClientTestBusinessLogic;

@ApplicationScoped
@Path("/test")
public class RestClientTestResource {
	
	@Inject
	RestClientTestBusinessLogic logic;
	
	@GET
	@Path("/method15")
	@Produces(MediaType.APPLICATION_JSON)
	public Response method15() {
    	try {
    		System.out.println("RestCilentTest method 15 is started. ------------------");
    		String outcome = logic.method15();
    		System.out.println("RestCilentTest method 15 is completed. ------------------");
    		return Response.ok(outcome).build();
    	} catch (Exception e) {
    		e.printStackTrace();
    		System.out.println("RestClientTestApplication method15 exception.>>>>>>>>>>>>>>>>>");
    		return Response.status(Status.BAD_REQUEST).build();
    	}
    }
    
	@GET
	@Path("/method16")
	@Produces(MediaType.APPLICATION_JSON)
	public Response method16() {
    	try {
    		System.out.println("RestCilentTest method 16 is started. ------------------");
    		String outcome = logic.method16();
    		System.out.println("RestCilentTest method 16 is completed. ------------------");
    		return Response.ok(outcome).build();
    	} catch (Exception e) {
    		e.printStackTrace();
    		System.out.println("RestClientTestApplication method16 exception.>>>>>>>>>>>>>>>>>");
    		return Response.status(Status.BAD_REQUEST).build();
    	}
    }
    
	@GET
	@Path("/method17")
	@Produces(MediaType.APPLICATION_JSON)
	public Response method17() {
    	try {
    		System.out.println("RestCilentTest method 17 is started. ------------------");
    		String outcome = logic.method17();
    		System.out.println("RestCilentTest method 17 is completed. ------------------");
    		return Response.ok(outcome).build();
    	} catch (Exception e) {
    		e.printStackTrace();
    		System.out.println("RestClientTestApplication method17 exception.>>>>>>>>>>>>>>>>>");
    		return Response.status(Status.BAD_REQUEST).build();
    	}
    }

}

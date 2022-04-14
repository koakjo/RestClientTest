package com.restclienttest.component;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restclienttest.common.RequestLoggingFilter;
import com.restclienttest.common.ResponseLoggingFilter;

@Dependent
public abstract class RestClientComponent<SENDCLASS,RECEIVECLASS>
{
	//restclient
	public Client client;
	protected Class<SENDCLASS> sendClass;
	protected Class<RECEIVECLASS> receiveClass;
	
	@PostConstruct
	public void postConstruct() {
		this.client = ClientBuilder.newClient();
		client.register(new RequestLoggingFilter());
		client.register(new ResponseLoggingFilter());
	}

	public RECEIVECLASS postCall(SENDCLASS sendClassObj, String URL) {
		String jsonText = "";
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			WebTarget target = client.target(URL);
			target.register(new ResponseLoggingFilter());
			jsonText = mapper.writeValueAsString(sendClassObj);
			System.out.println(jsonText);
			Entity<String> entity = Entity.entity(jsonText, MediaType.APPLICATION_JSON_TYPE);
			Response response = target.request(MediaType.APPLICATION_JSON_TYPE).post(entity, Response.class);
			response.getEntity();
			//readEntityでconnection.close()される
			return response.readEntity(receiveClass);
		} catch (JsonProcessingException jpe) {
			jpe.printStackTrace();
			System.out.println("postCall method JacksonException. errorURL is " + URL);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("postCall method Exception. please check details. errorURL is " + URL);
			return null;
		}
	}
	
	//public abstract RECEIVECLASS getCall();
	
	//public abstract RECEIVECLASS putCall();
	
	//public abstract RECEIVECLASS patchCall();
	
	//public abstract RECEIVECLASS deleteCall();



}


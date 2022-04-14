package com.restclienttest.common;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;

public class ResponseLoggingFilter implements ClientResponseFilter {
	
	private static final Logger LOG = Logger.getLogger(ResponseLoggingFilter.class.getName());
	  @Override
	  public void filter(ClientRequestContext requestContext,ClientResponseContext responseContext){
		  //responseContextにEntity読み取れる仕組みはなかった。MessageBodyIntercepter使わないとダメか
		  LOG.log(Level.INFO, responseContext.toString());
	  }
}

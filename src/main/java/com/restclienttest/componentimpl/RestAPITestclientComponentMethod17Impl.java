package com.restclienttest.componentimpl;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

import com.restclienttest.component.RestClientComponent;
import com.restclienttest.model17.RestAPITestmethodInput;
import com.restclienttest.model17.RestAPITestmethodOutput;

@Dependent
public class RestAPITestclientComponentMethod17Impl 
	extends RestClientComponent<RestAPITestmethodInput, RestAPITestmethodOutput>
{
	@PostConstruct
	public void restAPITestclientComponentMethod17Impl() {
		sendClass = RestAPITestmethodInput.class;
		receiveClass = RestAPITestmethodOutput.class;
	}
	
}

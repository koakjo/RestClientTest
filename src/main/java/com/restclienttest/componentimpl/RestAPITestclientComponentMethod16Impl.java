package com.restclienttest.componentimpl;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

import com.restclienttest.component.RestClientComponent;
import com.restclienttest.model16.RestAPITestmethodInput;
import com.restclienttest.model16.RestAPITestmethodOutput;

@Dependent
public class RestAPITestclientComponentMethod16Impl 
	extends RestClientComponent<RestAPITestmethodInput, RestAPITestmethodOutput>
{
	@PostConstruct
	public void restAPITestclientComponentMethod16Impl() {
		sendClass = RestAPITestmethodInput.class;
		receiveClass = RestAPITestmethodOutput.class;
	}
	
}

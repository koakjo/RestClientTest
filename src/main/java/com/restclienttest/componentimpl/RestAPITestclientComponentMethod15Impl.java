package com.restclienttest.componentimpl;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

import com.restclienttest.component.RestClientComponent;
import com.restclienttest.model15.RestAPITestmethodInputDto;
import com.restclienttest.model15.RestAPITestmethodOutputDto;

@Dependent
public class RestAPITestclientComponentMethod15Impl 
	extends RestClientComponent<RestAPITestmethodInputDto, RestAPITestmethodOutputDto>
{
	@PostConstruct
	public void restAPITestclientComponentMethod15Impl() {
		sendClass = RestAPITestmethodInputDto.class;
		receiveClass = RestAPITestmethodOutputDto.class;
	}
	
}

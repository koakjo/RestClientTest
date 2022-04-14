package com.restclienttest.logic;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restclienttest.componentimpl.RestAPITestclientComponentMethod15Impl;
import com.restclienttest.componentimpl.RestAPITestclientComponentMethod16Impl;
import com.restclienttest.componentimpl.RestAPITestclientComponentMethod17Impl;

@Dependent
public class RestClientTestBusinessLogic {
	
	@Inject
	public RestAPITestclientComponentMethod15Impl method15Comp;
	@Inject
	public RestAPITestclientComponentMethod16Impl method16Comp;
	@Inject
	public RestAPITestclientComponentMethod17Impl method17Comp;
	
	
	/*
	public RestClientTestBusinessLogic(){
		this.method15Comp = new RestAPITestclientComponentMethod15Impl();
		this.method16Comp = new RestAPITestclientComponentMethod16Impl();
		this.method17Comp = new RestAPITestclientComponentMethod17Impl();
		this.mapper = new ObjectMapper();
	}
	*/

	public String method15() {
		try{
			ObjectMapper mapper = new ObjectMapper();
			String methodURL = "http://127.0.0.1:8080/RestTestApp/Rest/Test/testrestclient15";
			com.restclienttest.model15.RestAPITestmethodInputDto input = new com.restclienttest.model15.RestAPITestmethodInputDto();
			input.setId("3");
			return mapper.writeValueAsString(method15Comp.postCall(input, methodURL));
		} catch (Exception e) {
			e.printStackTrace();
			return "error occured in method16(). please check details.";
		}
	}
	
	public String method16() {
		try{
			ObjectMapper mapper = new ObjectMapper();
			String methodURL = "http://127.0.0.1:8080/RestTestApp/Rest/Test/testrestclient16";
			com.restclienttest.model16.RestAPITestmethodInput input = new com.restclienttest.model16.RestAPITestmethodInput();
			input.setId("3");
			com.restclienttest.model16.InputTest inputTest = new com.restclienttest.model16.InputTest();
			inputTest.setExplanation("this is explanation.");
			input.setInputTest(inputTest);
			return mapper.writeValueAsString(method16Comp.postCall(input, methodURL));
		} catch (Exception e) {
			e.printStackTrace();
			return "error occured in method16(). please check details.";
		}
	}
	
	public String method17() {
		try{
			ObjectMapper mapper = new ObjectMapper();
			String methodURL = "http://127.0.0.1:8080/RestTestApp/Rest/Test/testrestclient17";
			com.restclienttest.model17.RestAPITestmethodInput input = new com.restclienttest.model17.RestAPITestmethodInput();
			input.setId("3");
			return mapper.writeValueAsString(method17Comp.postCall(input, methodURL));
		} catch (Exception e) {
			e.printStackTrace();
			return "error occured in method17(). please check details.";
		}
	}
	
	public void test() {
		
		
		
		
	}

}

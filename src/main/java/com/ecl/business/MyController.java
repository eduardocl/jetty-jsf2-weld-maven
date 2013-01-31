package com.ecl.business;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

@Named
public class MyController {

	private String version = "1.3";
	
	//@Inject private Logger logger;
	
	@PostConstruct
	public void init(){
		System.out.println("initializing the controller");
	}

	public String getVersion() {
		//logger.info("teste do log");
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
}

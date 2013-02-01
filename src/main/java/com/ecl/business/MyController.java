package com.ecl.business;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;

import com.ecl.domain.Service;

@Named
public class MyController {

	private String version = "1.3";
	
	@Inject
	private Service service;
	
	@PersistenceContext
	EntityManager em;
	
	@PostConstruct
	public void init(){
		System.out.println(em);
		System.out.println("initializing the controller");
	}

	public String getVersion() {
		//logger.info("teste do log");
		System.out.println(em);
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
}

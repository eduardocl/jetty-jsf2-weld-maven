package com.ecl.business;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ecl.domain.Contato;
import com.ecl.domain.Service;

@Named
public class MyController implements Serializable{

	private String version = "1.3";
	
	private EntityManager em;
	
	public MyController() {}
	
	@PostConstruct
	public void init(){
		System.out.println(em);
		System.out.println("initializing the controller");
	}

	public String getVersion() {
		//logger.info("teste do log");
		System.out.println("Get Version: " + em);
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public void salvar() {
		Contato contato = new Contato();
		contato.setNome("teste");
		createEntityManager().persist(contato);
	}
	
	public EntityManager createEntityManager() {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("jettyappDS");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
}

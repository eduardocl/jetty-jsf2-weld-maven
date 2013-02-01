package com.ecl.domain;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Alternative
public class EntityManagerProducer {

	@PersistenceContext
	private EntityManager em;
	
	@Produces
	@Alternative
	public EntityManager getEntityManager() {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("jettyappDS");
		em = emf.createEntityManager();
		return em;
	}
	
}

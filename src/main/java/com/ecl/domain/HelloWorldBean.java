package com.ecl.domain;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.ecl.business.MyController;

@ManagedBean
@SessionScoped
public class HelloWorldBean implements Serializable {
	private static final long serialVersionUID = 1L;

	//@Inject
	private MyController controller = new MyController();
	
	private String name = "";

  @ManagedProperty(value = "#{demoService}")
  private Service service;
  
  @Inject 
  @Alternative
  private EntityManager em;
  
  public String getName() {
	  System.out.println(em);
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setService(Service service) {
    this.service = service;
  }

  public String getReverseName() {
    return service.reverse(name);
  }
}
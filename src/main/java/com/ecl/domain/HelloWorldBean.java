package com.ecl.domain;

import javax.faces.bean.*;
import javax.inject.Inject;

import com.ecl.business.MyController;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloWorldBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MyController controller;
	
private String name = "";

  @ManagedProperty(value = "#{demoService}")
  private Service service;

  public String getName() {
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
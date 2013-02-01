package com.ecl.domain;

import javax.faces.bean.*;
import javax.inject.Inject;

import com.ecl.business.MyController;

@ManagedBean(name="demoService")
@ApplicationScoped
public class Service {

  @Inject
  private MyController controller;
	
  public String reverse(String name) {
	  System.out.println(controller);
    return new StringBuffer(name).reverse().toString().toLowerCase();
  }
}
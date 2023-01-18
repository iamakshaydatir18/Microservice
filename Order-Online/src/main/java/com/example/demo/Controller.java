package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class Controller {
	
	  @Autowired
	  JPARepository Dao;

	  @RequestMapping(method = RequestMethod.GET, value = "/fruits/{name}")
	  public fruit getFruit(@PathVariable String name)
	  {
		 fruit fruit = Dao.findByName(name);
		 
		 if (fruit == null)
			{
				throw new RuntimeException("User not found for: "+name);
			}
   		 return fruit;
		  
	  }
}

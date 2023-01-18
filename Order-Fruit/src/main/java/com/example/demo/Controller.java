package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class Controller {
	
	  @Autowired
	  public JPARepository Dao;
	  
	  @Autowired
	  public Environment env;

	  @RequestMapping(method = RequestMethod.GET, value = "/fruits/{name}")
	  public fruit getFruit(@PathVariable String name)
	  {
		 fruit fruit = Dao.findByName(name);
		 
		 if (fruit == null)
			{
				throw new RuntimeException("User not found for: "+name);
			}
		 
		 String port = env.getProperty("local.server.port");
		 fruit.setPort(port);
   		 return fruit;
		  
   		 
	  }
}

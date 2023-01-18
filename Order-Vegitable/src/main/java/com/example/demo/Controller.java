package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	  @Autowired
	 JPArepository Dao;
	  
	  @Autowired
	   public Environment env;

	 @RequestMapping(method = RequestMethod.GET, value = "/vegitables/{name}")
	 public Veg getVegitables(@PathVariable String name)
	  {
		 Veg veg = Dao.findByName(name);
		 
		 if (veg == null)
			{
				throw new RuntimeException("User not found for: "+name);
			}
		 String port = env.getProperty("local.server.port");
		  veg.setPort(port);
		 
  		 return veg;
		  
	  }
}

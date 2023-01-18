package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @Autowired
	ControllerProxy proxy;
    @Autowired
    fruitsFeignProxy fruitProxy;
	
	
	@GetMapping("/order/fruits/{name}/{quantity}")
	public Order getOrderFruits(@PathVariable String name,@PathVariable long quantity)
	{
		ResponseEntity<Order> responseEntity;
		//HashMap<String, String> map = new HashMap<>();
		//map.put("name", name);
		//http://localhost:8000/vegitables/Carrot
		//port ="8000";
		responseEntity = new RestTemplate()
				.getForEntity("http://localhost:8080/fruits/{name}", Order.class,name);
			
		Order order = responseEntity.getBody();
		  order.setQuantity(quantity);
		  order.setTotalCost(quantity*order.getCost());
		
		return new Order(order.getID(),order.getName(),order.getQuantity(), order.getTotalCost(),order.getCost(),order.getPort());
	}
	@GetMapping("/order/vegitables/{name}/{quantity}")
	public Order getOrderVeg(@PathVariable String name,@PathVariable long quantity)
	{
		ResponseEntity<Order> responseEntity;
		//HashMap<String, String> map = new HashMap<>();
		//map.put("name", name);
		//http://localhost:8000/vegitables/Carrot
		//port ="8000";
		responseEntity = new RestTemplate()
				.getForEntity("http://localhost:8000/vegitables/{name}", Order.class,name);
		
		Order order = responseEntity.getBody();
		  order.setQuantity(quantity);
		  order.setTotalCost(quantity*order.getCost());
		
		return new Order(order.getID(),order.getName(),order.getQuantity(), order.getTotalCost(),order.getCost(),order.getPort());
	}
	
	@GetMapping("/order/vegitables-feign/{name}/{quantity}")
	public Order getOrderVegfeign(@PathVariable String name,@PathVariable long quantity)
	{
		
		Order order = proxy.totalVegCost(name);
		  order.setQuantity(quantity);
		  order.setTotalCost(quantity*order.getCost());
		
		return new Order(order.getID(),order.getName()+ " feign",order.getQuantity(), order.getTotalCost(),order.getCost(),order.getPort());
	}
	
	@GetMapping("/order/fruits-feign/{name}/{quantity}")
	public Order getOrderFruitsfeign(@PathVariable String name,@PathVariable long quantity)
	{
		
		Order order = fruitProxy.totalFruitCost(name);
		  order.setQuantity(quantity);
		  order.setTotalCost(quantity*order.getCost());
		
		return new Order(order.getID(),order.getName()+ " feign",order.getQuantity(), order.getTotalCost(),order.getCost(),order.getPort());
	}
	
	
	
}

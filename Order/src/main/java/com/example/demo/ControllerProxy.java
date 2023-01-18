package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="vegitable-order")
public interface ControllerProxy {
	
	@GetMapping("/vegitables/{name}")
	public Order totalVegCost(@PathVariable String name);
	
}

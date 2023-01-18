package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="fruit-order")
public interface fruitsFeignProxy {
	@GetMapping("/fruits/{name}")
	public Order totalFruitCost(@PathVariable String name);
}

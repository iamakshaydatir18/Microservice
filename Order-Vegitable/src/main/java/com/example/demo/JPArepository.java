package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
public interface JPArepository extends JpaRepository<Veg, Integer>{

	   public Veg findByName(String name);
}

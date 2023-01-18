package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPARepository extends JpaRepository<fruit, Integer> {

	  fruit findByName(String name);
}

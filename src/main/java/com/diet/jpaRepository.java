package com.diet;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diet.entities.diet;

public interface jpaRepository extends JpaRepository<diet, Long> {

	diet findById(int id);
	
	

}

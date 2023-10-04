package com.diet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.diet.entities.diet;
import com.diet.entities.exercise;

public interface exerciseRepository extends JpaRepository<exercise, Integer> {

	
}

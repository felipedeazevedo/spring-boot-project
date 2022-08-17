package com.felipe.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.springbootproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}

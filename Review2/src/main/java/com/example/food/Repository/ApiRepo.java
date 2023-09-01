package com.example.food.Repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.food.Model.Menu;


public interface ApiRepo extends JpaRepository<Menu, Long> {
     
		

	}


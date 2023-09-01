package com.example.food.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.food.Model.Signin;

public interface SigninRepo extends JpaRepository<Signin, Long> {
boolean existsByUsermail(String usermail);
	
	Optional<Signin> findById(Long id);
	
	void deleteById(Long id);
    @Query("select s from Signin s")
    List<Signin> findAllQuery();
    @Query("select s from Signin s where s.usermail= :usermail")
	Signin findByUsermail(@Param("usermail")String usermail);
}

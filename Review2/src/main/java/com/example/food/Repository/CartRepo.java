package com.example.food.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.Model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>{

}

package com.example.food.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.food.Model.Signin;

public interface SigninService {
	public boolean addUser(Signin signin);
	public List<Signin> getUser();
	public boolean updateUser(Long id, Signin signin);
	public boolean deleteUser(Long id);
	public Page<Signin> getAllUser(PageRequest pageRequest);
	List<Signin> findAllQuery();
	
	public Signin findUsermail();
	Signin findByUsermail(String usermail);
	Signin findByUsermail();
}

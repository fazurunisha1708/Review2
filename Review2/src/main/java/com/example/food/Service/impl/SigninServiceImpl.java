package com.example.food.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.food.Model.Signin;
import com.example.food.Repository.SigninRepo;
import com.example.food.Service.SigninService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SigninServiceImpl implements SigninService{
	@Autowired
	private SigninRepo signinRepository;

	@Override
	public boolean addUser(Signin signin) {
		boolean userExists = signinRepository.existsByUsermail(signin.getUsermail());
		if(!userExists) {
			signinRepository.save(signin);
			return true;
		} else {
			return false;
		}
	}

	public List<Signin> getUser() {
		return signinRepository.findAll();
	}

	public boolean updateUser(Long id,Signin signin) {
		Optional<Signin> existingUserOptional = signinRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			Signin userExists = existingUserOptional.get();
			
			userExists.setUsername(signin.getUsername());
			userExists.setUsermail(signin.getUsermail());
			userExists.setMobileno(signin.getMobileno());
			userExists.setPassword(signin.getPassword());
			signinRepository.save(userExists);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(Long id) {
		Optional<Signin> existingUserOptional = signinRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			signinRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Page<Signin> getAllUser(PageRequest pageRequest){
		return signinRepository.findAll(pageRequest);
	}
	@Override
	public List<Signin> findAllQuery(){
		return signinRepository.findAllQuery();
	}
	@Override
	public Signin findByUsermail(String usermail) {
		return signinRepository.findByUsermail(usermail);
	}
//
	@Override
	public Signin findByUsermail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Signin findUsermail() {
		// TODO Auto-generated method stub
		return null;
	}
}

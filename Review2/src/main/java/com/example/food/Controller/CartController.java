package com.example.food.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.Model.Signin;
import com.example.food.Service.SigninService;
@RestController
@RequestMapping("/api/v1/user")
public class CartController {
	private static final Logger logger=LoggerFactory.getLogger(CartController.class);
	@Autowired
	private SigninService signinService;
	
	@GetMapping("/getUser")
	public ResponseEntity<List<Signin>> getUser(){
		System.out.println("SOP");
		logger.info("This is Bucks Bunny");
		logger.debug("debug");
		logger.warn("warn");
		logger.error("error");
		return ResponseEntity.status(200).body(signinService.getUser());
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<Page<Signin>> getAllUser(
			@RequestParam(defaultValue="0") int page,
			@RequestParam(defaultValue="10") int size,
			@RequestParam(defaultValue="id") String sortField,
			@RequestParam(defaultValue="asc") String sortOrder){
		PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortOrder), sortField));
		return ResponseEntity.status(200).body(signinService.getAllUser(pageRequest));
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody Signin signin){
		boolean dataSaved = signinService.addUser(signin);
		if(dataSaved) {
			return ResponseEntity.status(200).body("User added successfully!");
		}else {
			return ResponseEntity.status(404).body("Something went wrong!");
		}
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody Signin signin){
		boolean userData = signinService.updateUser(id,signin);
		if(userData) {
			return ResponseEntity.status(200).body("User updated successfully");
		} else{
			return ResponseEntity.status(404).body("No record found to be updated");
		}
	}
	
	
	@DeleteMapping("/deleteUser")
	public ResponseEntity<String> deleteUser(@RequestParam Long id){
		boolean userDeleted = signinService.deleteUser(id);
		if(userDeleted) {
			return ResponseEntity.status(200).body("User deleted successfully");
		} else {
			return ResponseEntity.status(404).body("No record found to be updated");
		}
	}
}

package com.example.food.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Onlineservice")
public class Signin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String username;
 private String usermail;
 private long mobileno;
 private String password;
 @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
 @JoinColumn(name="product_id",referencedColumnName = "id")
 private List<Cart> product;
 
 @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
 @JoinColumn(name="order_id",referencedColumnName = "id")
 private List<Menu> order;

public Signin(Long id, String username, String usermail, long mobileno, String password, List<Cart> cart,
		List<Menu> menu) {
	super();
	this.id = id;
	this.username = username;
	this.usermail = usermail;
	this.mobileno = mobileno;
	this.password = password;
	
}


public Signin() {
	super();
	// TODO Auto-generated constructor stub
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getUsermail() {
	return usermail;
}


public void setUsermail(String usermail) {
	this.usermail = usermail;
}


public long getMobileno() {
	return mobileno;
}


public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}
public List<Cart> getProduct(){
	 return product;
}
public void setProduct(List<Cart> product) {
	 this.product=product;
}
public List<Menu> getOrder(){
	 return order;
}
public void setOrder(List<Menu> order) {
	 this.order=order;
}

	}


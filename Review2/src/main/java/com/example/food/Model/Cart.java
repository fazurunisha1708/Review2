package com.example.food.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderdetails")
public class Cart {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String dish;
		private int quantity;
		private double price;
		public Cart(Long id, String dish, int quantity, double price) {
			super();
			this.id = id;
			this.dish = dish;
			this.quantity = quantity;
			this.price = price;
		}
		public Cart() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDish() {
			return dish;
		}
		public void setDish(String dish) {
			this.dish = dish;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
	}
	


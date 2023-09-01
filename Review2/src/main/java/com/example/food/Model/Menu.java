package com.example.food.Model;

 
import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="homemadefood")
public class Menu {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long orderid;
		private Date dateoforder;
		private String dish;
		private String description;
		private int quantity;
		private double price;
		public Menu(Long orderid, Date dateoforder, String dish, String description, int quantity, double price) {
			super();
			this.orderid = orderid;
			this.dateoforder = dateoforder;
			this.dish = dish;
			this.description = description;
			this.quantity = quantity;
			this.price = price;
		}
		public Menu() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getOrderid() {
			return orderid;
		}
		public void setOrderid(Long orderid) {
			this.orderid = orderid;
		}
		public Date getDateoforder() {
			return dateoforder;
		}
		public void setDateoforder(Date dateoforder) {
			this.dateoforder = dateoforder;
		}
		public String getDish() {
			return dish;
		}
		public void setDish(String dish) {
			this.dish = dish;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
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
		public void setPrice(double price) {
			this.price = price;
		}
		
	   
	}


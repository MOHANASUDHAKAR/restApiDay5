package com.excercise.day5.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
	@Id
	@GeneratedValue
	private int id;
	private String Bookname;
	private float price;
	private int quantity;
	private String authorName;
	public BookEntity(int id, String bookname, float price, int quantity, String authorName) {
		super();
		this.id = id;
		 Bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.authorName = authorName;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return Bookname;
	}
	public void setBookName(String bookname) {
		Bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

}

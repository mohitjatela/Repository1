package com.restapi.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bid;
	private String title;
	private Float price;

	@OneToOne(cascade = CascadeType.ALL)
	private Author author;

//	toString method
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}

//	Default Constructor
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}



	//	getter and setters method
	public Integer getBid() {
		return bid;
	}

//	parameterized constructor
	public Books(Integer bid, String title, Float price, Author author) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
		this.author = author;
	}


	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

//	

}

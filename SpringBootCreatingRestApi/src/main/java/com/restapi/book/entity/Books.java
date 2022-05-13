package com.restapi.book.entity;

public class Books {

	private Integer id;
	private String author;
	private String title;

	//// Default constructor
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	//// parameterized constructor
	public Books(Integer id, String author, String title) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
	}

//	toString Method
	@Override
	public String toString() {
		return "Books [id=" + id + ", author=" + author + ", title=" + title + "]";
	}

	/// gettter and setters functions
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

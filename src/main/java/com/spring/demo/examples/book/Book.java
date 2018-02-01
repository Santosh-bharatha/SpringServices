package com.spring.demo.examples.book;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	long id;
	String name;
	String author;
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	/**
	 * @param id
	 * @param name
	 * @param author
	 */
	public Book(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	/**
	 * 
	 */
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	

}

package com.spring.demo.examples.book;

public class HelloWorldBean  {
	
	private String message;
	
	public HelloWorldBean(String bean){
		this.message = bean;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	
}

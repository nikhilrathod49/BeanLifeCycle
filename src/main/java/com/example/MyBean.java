package com.example;

public class MyBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("Bean is being initialized.");
	}

	public void destroy() {
		System.out.println("Bean is being destroyed.");
	}

	public void displayMessage() {
		System.out.println("Message from MyBean: " + message);
	}
}
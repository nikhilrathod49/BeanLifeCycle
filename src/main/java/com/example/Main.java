package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) { // load memory 
		// Container start
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		
		// Retrieve the bean from the container
		MyBean myBean = (MyBean) context.getBean("myBean");

		// Use the bean
		myBean.displayMessage();

		// Close the application context (destroying the bean)
		((AbstractApplicationContext) context).close();
	}
}   
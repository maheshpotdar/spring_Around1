package com.mahesh.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/model/spring.xml");
		Traingle t11 = context.getBean("t1", Traingle.class);

		String trName = t11.getName();
		System.out.println("Traingle Name: " + trName);

	}
}

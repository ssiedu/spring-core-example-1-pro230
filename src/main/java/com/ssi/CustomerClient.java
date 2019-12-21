package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		
		Customer cust1=context.getBean("c1",Customer.class);
		System.out.println(cust1);
		
	}

}


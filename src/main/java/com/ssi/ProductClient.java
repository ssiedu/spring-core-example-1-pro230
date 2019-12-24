package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-conf.xml");
		Product product=context.getBean("p1",Product.class);
		System.out.println(product);
		
		
	}

}

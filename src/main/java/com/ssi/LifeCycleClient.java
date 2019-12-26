package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleClient {
	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("lifecycle.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
	}
}

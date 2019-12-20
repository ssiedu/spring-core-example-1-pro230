package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUser {

	public static void main(String[] args) {
		System.out.println("Starting Spring Application : Its Main of DemoUser ");
		//ApplicationContext context=new FileSystemXmlApplicationContext("e:/spring-conf/spring.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		//System.out.println("We haven't demanded d1 yet");
		
		System.out.println("Demanding d1 first time ==============>");
		Demo ob1=context.getBean("d1",Demo.class);
		
		System.out.println("Demanding d1 second time ==============>");
		Demo ob2=context.getBean("d1",Demo.class);
		
		//System.out.println(ob1==ob2);
		
	}

}

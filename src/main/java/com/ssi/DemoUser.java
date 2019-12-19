package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUser {

	public static void main(String[] args) {

		//we need to call the show method of Demo class
		//we need an instance of Demo
		
		System.out.println("Starting Spring Application : Its Main of DemoUser ");
		//Demo ob=new Demo();
		//I will ask spring to provide me the instance of Demo class.
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Demo ob1=(Demo) context.getBean("d1");
		ob1.show();
		
		//Test t=new Test();
		Test t=(Test)context.getBean("t1");
		t.display();

	}

}

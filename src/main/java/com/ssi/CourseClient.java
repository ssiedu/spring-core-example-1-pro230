package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseClient {

	public static void main(String[] args) {
		
		Course course1=new Course();
		course1.setCode(5001);
		course1.setName("Java");
		course1.setDuration(5);
		course1.setFees(16000);
		System.out.println(course1);
		
		Course course2=new Course(5002,"Python",6,18000);
		System.out.println(course2);

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Course course3=context.getBean("course",Course.class);
		System.out.println(course3);
		
	}

}

package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpClient {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Emp emp1=context.getBean("e1",Emp.class);
		System.out.println(emp1);
		

	}

}

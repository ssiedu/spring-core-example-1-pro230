package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("factory.xml");
		
		Square square=context.getBean("square",Square.class);
		System.out.println(square);
		
		
		//Connector con=context.getBean("connector",Connector.class);
		//System.out.println(con);
		
		
		/*Circle c1=context.getBean("circle1",Circle.class);
		Circle c2=context.getBean("circle2",Circle.class);
		System.out.println(c1);
		System.out.println(c2);*/
		
	}

}

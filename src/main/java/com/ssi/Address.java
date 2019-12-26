package com.ssi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean {
	private String hno;
	private String city;
	private String state;
	
	
	
	public void doIt(){
		System.out.println("Doing Something In Address Class");
	}
	
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		System.out.println("House No Set");
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("City Set");
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("State Set");
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state
				+ "]";
	}
	public Address(String hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}
	public Address() {
		System.out.println("Address Constructor Invoked");
	}

	public void afterPropertiesSet() throws Exception {
		
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

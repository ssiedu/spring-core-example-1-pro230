package com.ssi;

public class Connector {
	
	private Connector(){
		System.out.println("Using A Constructor");
	}
	
	public static Connector getConnectorInstance(){
		System.out.println("Using A Factory Method");
		return new Connector();
	}
	
	public String toString(){
		return "Its A Connector Instance";
	}
}

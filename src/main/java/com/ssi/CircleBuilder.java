package com.ssi;

public class CircleBuilder {
	public static Circle getSmallCircle(){
		return new Circle(10);
	}
	public static Circle getLargeCircle(){
		return new Circle(1000);
	}
}

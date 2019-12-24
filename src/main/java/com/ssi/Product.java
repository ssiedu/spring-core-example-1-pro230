package com.ssi;

public class Product {
	private int pcode;
	private String pname;
	private int price;
	private Company company;
	
	public Product() {
		System.out.println("Zero Arg Construtor ");
	}
	
	public Product(String p1, String p2, String p3){
		System.out.println("Three String Arg Constructor");
	}
	
	public Product(int code, String pname, int price) {
		System.out.println("Three Args Constructor");
		this.pcode = code;
		this.pname = pname;
		this.price = price;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		System.out.println("Setting PCode");
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		System.out.println("Setting PName");
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Setting Price");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", price="
				+ price + ", company=" + company + "]";
	}
	public Product(int pcode, String pname, int price, Company company) {
		System.out.println("Four Args Constructor");
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.company = company;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}

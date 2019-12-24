package com.ssi;

public class Company {
	private String code;
	private String cname;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Company [code=" + code + ", cname=" + cname + "]";
	}
	
}

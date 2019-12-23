package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Emp {
	private int eno;
	private String name;
	private String branch;
	private String city;
	private Map<String,Address> addresses;
	
	//private List<Address> addresses;
	//private Set<String> mobiles;
	private List<String> mobiles;
	//private Map<String,String> emails;
	private Properties emails;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", name=" + name + ", addresses=" + addresses
				+ "]";
	}
	public List<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Properties getEmails() {
		return emails;
	}
	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	/*public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}*/
	public Map<String, Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}
	
	/*public Map<String, String> getEmails() {
		return emails;
	}
	public void setEmails(Map<String, String> emails) {
		this.emails = emails;
	}*/
	
	
}

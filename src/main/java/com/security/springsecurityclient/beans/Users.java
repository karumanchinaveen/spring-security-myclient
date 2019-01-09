package com.security.springsecurityclient.beans;

public class Users {
	
	private String firstname;
	
	private String Middlename;
	
	private String lastname;
	
	private String email;
	
	private int age;
	
	private Address address;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return Middlename;
	}

	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [firstname=" + firstname + ", Middlename=" + Middlename + ", lastname=" + lastname + ", email="
				+ email + ", age=" + age + ", address=" + address + "]";
	}
	
	
	

}

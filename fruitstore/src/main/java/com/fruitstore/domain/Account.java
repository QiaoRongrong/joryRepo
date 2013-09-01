package com.fruitstore.domain;

import java.io.Serializable;


public class Account implements Serializable {

	private static final long serialVersionUID = 8751282105532159742L;

	private String username;
	private String password;
	private String usertype;
	private String email;
	private String firstName;
	private String lastName;
	private String status;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String mobile;
	private String phone;

	// private String favouriteCategoryId;
	// private String languagePreference;
	// private boolean listOption;
	// private boolean bannerOption;
	// private String bannerName;

	public Account(){}
	
	public Account(String username, String password, String usertype) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}
	
	
	public String getMobile() {
		return mobile;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password
				+ ", usertype=" + usertype + ", email=" + email
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", status=" + status + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", country=" + country + ", mobile="
				+ mobile + ", phone=" + phone + "]";
	}

	

}

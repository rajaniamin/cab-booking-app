package com.calBookingApp.model;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer customerId;	
@Size(min = 3, max = 255)
@NotNull(message="Username should not be null")
private String username;
@Min(value=8, message=" Password should consists of atelast 8 characters")
@NotNull
@NotBlank
private String password;
@Min(value=10, message="Mobile number should consists of 10 digits")
private String mobileNumber;
private String email;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="id")
private Address address;

private boolean journey_status;

public User() {
	
}

public User(String username, String password, Address address, String mobileNumber, String email) {
	super();
	this.username = username;
	this.password = password;
	this.address = address;
	this.mobileNumber = mobileNumber;
	this.email = email;
}

public Integer getCustomerId() {
	return customerId;
}

public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
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

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "User [customerId=" + customerId + ", username=" + username + ", password=" + password + ", address="
			+ address + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
}





}


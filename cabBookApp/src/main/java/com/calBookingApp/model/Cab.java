package com.calBookingApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Cab {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cabId;
	private String cabType;
	private Integer ratePerKm;

	@OneToOne(cascade=CascadeType.ALL,mappedBy="cab")
	@JsonIgnore

	private Driver driver;
	
	
	public Cab() {
		// TODO Auto-generated constructor stub
	}
	
	

   public Cab(String cabType, Integer ratePerKm, Driver driver) {
		super();
		this.cabType = cabType;
		this.ratePerKm = ratePerKm;
		this.driver = driver;
	}



public Integer getCabId() {
	return cabId;
}



public void setCabId(Integer cabId) {
	this.cabId = cabId;
}



public String getCabType() {
	return cabType;
}



public void setCabType(String cabType) {
	this.cabType = cabType;
}



public Integer getRatePerKm() {
	return ratePerKm;
}



public void setRatePerKm(Integer ratePerKm) {
	this.ratePerKm = ratePerKm;
}



public Driver getDriver() {
	return driver;
}



public void setDriver(Driver driver) {
	this.driver = driver;
}



@Override
public String toString() {
	return "Cab [cabId=" + cabId + ", cabType=" + cabType + ", ratePerKm=" + ratePerKm + "]";
}



}

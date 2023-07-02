package com.calBookingApp.model;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Driver {
	private Integer driverId;
	
	@Size(min = 3, max = 255)
	@NotNull(message="Username should not be null")
	private String username;
	@Min(value=8, message=" Password should consists of atelast 8 characters")
	private String password;
	@Min(value=10, message="Mobile number should consists of 10 digits")
	private String mobileNumber;
	private String email;
	
	@Min(value=1, message="Length of the id should be more than 1")
	private Integer licenseNo;
	@Min(value=1, message="Length of the id should be more than 1")
	private Double rating;
	private Boolean available;

	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="cabId")
	private Cab cab;


	@OneToMany(cascade = CascadeType.ALL,mappedBy = "driver",orphanRemoval = true)
	@JsonIgnore
	private List<TripBooking> tripBooking;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}
   
	
	


	public Driver(@Size(min = 3, max = 255) @NotNull(message = "Username should not be null") String username,
			@Min(value = 8, message = " Password should consists of atelast 8 characters") String password,
			@Min(value = 10, message = "Mobile number should consists of 10 digits") String mobileNumber, String email,
			@Min(value = 1, message = "Length of the id should be more than 1") Integer licenseNo,
			@Min(value = 1, message = "Length of the id should be more than 1") Double rating, Boolean available,
			Cab cab, List<TripBooking> tripBooking) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.licenseNo = licenseNo;
		this.rating = rating;
		this.available = available;
		this.cab = cab;
		this.tripBooking = tripBooking;
	}





	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
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

	public Integer getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(Integer licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public List<TripBooking> getTripBooking() {
		return tripBooking;
	}

	public void setTripBooking(List<TripBooking> tripBooking) {
		this.tripBooking = tripBooking;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", username=" + username + ", password=" + password 
				 + ", mobileNumber=" + mobileNumber + ", email=" + email + ", licenseNo=" + licenseNo
				+ ", rating=" + rating + ", available=" + available + ", cab=" + cab + ", tripBooking=" + tripBooking
				+ "]";
	}

	
	
	

}

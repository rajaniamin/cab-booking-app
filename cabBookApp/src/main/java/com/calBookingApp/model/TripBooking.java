package com.calBookingApp.model;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class TripBooking {
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Integer TripBookingId;
	   @NotNull
	   private Integer CustomerId; 
	   
	   @ManyToOne(cascade=CascadeType.ALL)
	   @JoinColumn(name="driverId",referencedColumnName = "driverID")
	   private Driver driver;

	   @NotNull(message = "From Location should not be Null")
	   private String From_location;
	   
	   @NotNull(message = "To Location should not be Null")
	   private String To_location;
	   
	   
	    @FutureOrPresent(message = "{futOrPres}")
	    @NotNull(message = "date should not be Null")
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate Fromdate_time;
	    
	    
	    @FutureOrPresent(message = "{futOrPres}")
	    @NotNull(message = "date should not be Null")
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private LocalDate Todate_time;
	   
	    private Integer km;
	    private Integer  Totalamount;
	    private Boolean Payment;
    
	    public TripBooking() {
		// TODO Auto-generated constructor stub
	    }

	    public TripBooking(@NotNull Integer customerId, Driver driver,
			@NotNull(message = "From Location should not be Null") String from_location,
			@NotNull(message = "To Location should not be Null") String to_location,
			@FutureOrPresent(message = "{futOrPres}") @NotNull(message = "date should not be Null") LocalDate fromdate_time,
			@FutureOrPresent(message = "{futOrPres}") @NotNull(message = "date should not be Null") LocalDate todate_time,
			Integer km, Integer totalamount, Boolean payment) {
		super();
		CustomerId = customerId;
		this.driver = driver;
		From_location = from_location;
		To_location = to_location;
		Fromdate_time = fromdate_time;
		Todate_time = todate_time;
		this.km = km;
		Totalamount = totalamount;
		Payment = payment;
	}

	public Integer getTripBookingId() {
		return TripBookingId;
	}

	public void setTripBookingId(Integer tripBookingId) {
		TripBookingId = tripBookingId;
	}

	public Integer getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getFrom_location() {
		return From_location;
	}

	public void setFrom_location(String from_location) {
		From_location = from_location;
	}

	public String getTo_location() {
		return To_location;
	}

	public void setTo_location(String to_location) {
		To_location = to_location;
	}

	public LocalDate getFromdate_time() {
		return Fromdate_time;
	}

	public void setFromdate_time(LocalDate fromdate_time) {
		Fromdate_time = fromdate_time;
	}

	public LocalDate getTodate_time() {
		return Todate_time;
	}

	public void setTodate_time(LocalDate todate_time) {
		Todate_time = todate_time;
	}

	public Integer getKm() {
		return km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	public Integer getTotalamount() {
		return Totalamount;
	}

	public void setTotalamount(Integer totalamount) {
		Totalamount = totalamount;
	}

	public Boolean getPayment() {
		return Payment;
	}

	public void setPayment(Boolean payment) {
		Payment = payment;
	}

	@Override
	public String toString() {
		return "TripBooking [TripBookingId=" + TripBookingId + ", CustomerId=" + CustomerId + ", driver=" + driver
				+ ", From_location=" + From_location + ", To_location=" + To_location + ", Fromdate_time="
				+ Fromdate_time + ", Todate_time=" + Todate_time + ", km=" + km + ", Totalamount=" + Totalamount
				+ ", Payment=" + Payment + "]";
	}
    
    
}

package com.hexaware.airticketbooking.entities;

import java.time.LocalDate;
public class Ticket {
	
	private int ticketId;
	
	private LocalDate travelDate;
	
	private String email;
	private double totalAmount;
	private int noOfPassengers;
	private User user;
	private Flight flight;
	public Ticket() {
		super();
	}
	public Ticket(int ticketId, LocalDate travelDate, String email, double totalAmount, int noOfPassengers, User user,
			Flight flight) {
		super();
		this.ticketId = ticketId;
		this.travelDate = travelDate;
		this.email = email;
		this.totalAmount = totalAmount;
		this.noOfPassengers = noOfPassengers;
		this.user = user;
		this.flight = flight;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public LocalDate getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}	
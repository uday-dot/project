package com.hexaware.airticketbooking.entities;

import java.time.LocalTime;
import java.util.Objects;

public class Flight {

	private int flightId;
	private String flightName;
	private String typeOfFlight;
	private String source;
	private String destination;
	private LocalTime timeOfArrival;
	private LocalTime timeOfDeparture;
	private String duration;
	private double fare;
	private FlightOwner flightOwner;
	public Flight() {
		super();
	}
	public Flight(int flightId, String flightName, String typeOfFlight, String source, String destination,
			LocalTime timeOfArrival, LocalTime timeOfDeparture, String duration, double fare, FlightOwner flightOwner) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.typeOfFlight = typeOfFlight;
		this.source = source;
		this.destination = destination;
		this.timeOfArrival = timeOfArrival;
		this.timeOfDeparture = timeOfDeparture;
		this.duration = duration;
		this.fare = fare;
		this.flightOwner = flightOwner;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getTypeOfFlight() {
		return typeOfFlight;
	}
	public void setTypeOfBus(String typeOfFlight) {
		this.typeOfFlight = typeOfFlight;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalTime getTimeOfArrival() {
		return timeOfArrival;
	}
	public void setTimeOfArrival(LocalTime timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}
	public LocalTime getTimeOfDeparture() {
		return timeOfDeparture;
	}
	public void setTimeOfDeparture(LocalTime timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public FlightOwner getFlightOwner() {
		return flightOwner;
	}
	public void setFlightOwner(FlightOwner flightOwner) {
		this.flightOwner = flightOwner;
	}
	@Override
	public int hashCode() {
		return Objects.hash(destination, duration, fare, flightId, flightName, flightOwner, source, timeOfArrival,
				timeOfDeparture, typeOfFlight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(destination, other.destination) && Objects.equals(duration, other.duration)
				&& Double.doubleToLongBits(fare) == Double.doubleToLongBits(other.fare) && flightId == other.flightId
				&& Objects.equals(flightName, other.flightName) && Objects.equals(flightOwner, other.flightOwner)
				&& Objects.equals(source, other.source) && Objects.equals(timeOfArrival, other.timeOfArrival)
				&& Objects.equals(timeOfDeparture, other.timeOfDeparture)
				&& Objects.equals(typeOfFlight, other.typeOfFlight);
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", typeOfFlight=" + typeOfFlight
				+ ", source=" + source + ", destination=" + destination + ", timeOfArrival=" + timeOfArrival
				+ ", timeOfDeparture=" + timeOfDeparture + ", duration=" + duration + ", fare=" + fare
				+ ", flightOwner=" + flightOwner + "]";
	}
	
	
}
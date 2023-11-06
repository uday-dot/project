package com.hexaware.airticketbooking.services;

import java.util.List;

import com.hexaware.airticketbooking.entities.Admin;
import com.hexaware.airticketbooking.entities.Flight;
import com.hexaware.airticketbooking.entities.User;

public interface IFlightService {
	public int insertFlight(Flight flight);
	public int updateFlight(Flight flight);
	public int deleteFlight(int flightId);
	public Flight getFlightById(int flightId);
	public List<Flight> getAllFlight();
	
	

}

package com.hexaware.airticketbooking.services;

import java.util.List;

import com.hexaware.airticketbooking.entities.Admin;
import com.hexaware.airticketbooking.entities.FlightOwner;
import com.hexaware.airticketbooking.entities.Ticket;
import com.hexaware.airticketbooking.entities.User;

public interface IFlightOwnerService {
	public int insertFlightOwner(FlightOwner owner);
	public int updateFlightOwner(FlightOwner owner);
	public int deleteFlightOwner(int ownerId );
	public FlightOwner getByOwnerId(int ownerId);
	public List<FlightOwner> getAllOwner();
	
	

}

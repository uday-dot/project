package com.hexaware.airticketbooking.services;

import java.util.List;

import com.hexaware.airticketbooking.entities.Admin;
import com.hexaware.airticketbooking.entities.Passenger;
import com.hexaware.airticketbooking.entities.User;

public interface IPassengerService {
	public int insertPassenger(Passenger passenger);
	public int updatePassenger(Passenger passenger);
	public int deletePassenger(int passengerId);
	public Passenger getByPassengerId(int passengerId);
	public List<Passenger> getAllPassenger();
	
	

}

package com.hexaware.airticketbooking.services;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.airticketbooking.entities.FlightOwner;
import com.hexaware.airticketbooking.entities.Ticket;
import com.hexaware.airticketbooking.entities.User;

public class FlightownerServiceImp implements IFlightOwnerService {

	@Override
	public int insertFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int deleteFlightOwner(int ownerId) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public FlightOwner getByOwnerId(int ownerId) {
		// TODO Auto-generated method stub
		FlightOwner owner=new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com");
		return owner;
	}

	@Override
	public List<FlightOwner> getAllOwner() {
		// TODO Auto-generated method stub
		List<FlightOwner> owner=new ArrayList<FlightOwner>();
		owner.add(new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com"));
		owner.add(new FlightOwner(2,"yash","yash@123","6301545096","yash@gmail.com"));
		
		
		
		return owner;
	}

}

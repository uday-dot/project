package com.hexaware.airticketbooking.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.airticketbooking.entities.Flight;
import com.hexaware.airticketbooking.entities.FlightOwner;

public class FlightServiceImp implements IFlightService {

	@Override
	public int insertFlight(Flight flight) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Flight getFlightById(int flightId) {
		// TODO Auto-generated method stub
		Flight flight=new Flight(1,"indigo","businessclass","rajampet","chittoor",LocalTime.of(10, 43),LocalTime.of(11, 43),"1hr",3000,new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com"));
		return flight;
	}

	@Override
	public List<Flight> getAllFlight() {
		List<Flight> flightls=new ArrayList<Flight>();
		flightls.add(new Flight(1,"indigo","businessclass","rajampet","chittoor",LocalTime.of(10, 43),LocalTime.of(11, 43),"1hr",3000,new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com")));
		flightls.add(new Flight(2,"kingfisher","normalcalss","hyderabad","chennai",LocalTime.of(11,30),LocalTime.of(12,30),"2hr",4000,new FlightOwner(2,"yash","yash@123","6301545096","yash@gmail.com")));
		// TODO Auto-generated method stub
		return flightls;
	}

}

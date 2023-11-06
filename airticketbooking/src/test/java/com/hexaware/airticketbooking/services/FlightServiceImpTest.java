package com.hexaware.airticketbooking.services;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.airticketbooking.entities.Flight;
import com.hexaware.airticketbooking.entities.FlightOwner;

class FlightServiceImpTest {
    FlightServiceImp service=new FlightServiceImp();
	@Test
	void testInsertFlight() {
		Flight flight=new Flight();
		int actual=service.insertFlight(flight);
		assertEquals(1,actual);
	}

	@Test
	void testUpdateFlight() {
		Flight flight=new Flight();
		int actual=service.updateFlight(flight);
		assertEquals(2,actual);
	}

	@Test
	void testDeleteFlight() {
		Flight flight=new Flight();
		int actual=service.deleteFlight(2);
		assertEquals(3,actual);
	}

	@Test
	void testGetFlightById() {
		Flight actual=service.getFlightById(5);
		Flight expected=new Flight(1,"indigo","businessclass","rajampet","chittoor",LocalTime.of(10, 43),LocalTime.of(11, 43),"1hr",3000,new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com"));
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllFlight() {
		List<Flight> expected=new ArrayList<Flight>();
		expected.add(new Flight(1,"indigo","businessclass","rajampet","chittoor",LocalTime.of(10, 43),LocalTime.of(11, 43),"1hr",3000,new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com")));
		expected.add(new Flight(2,"kingfisher","normalcalss","hyderabad","chennai",LocalTime.of(11,30),LocalTime.of(12,30),"2hr",4000,new FlightOwner(2,"yash","yash@123","6301545096","yash@gmail.com")));
		List<Flight> actual=service.getAllFlight();
		assertEquals(expected,actual);
	}

}

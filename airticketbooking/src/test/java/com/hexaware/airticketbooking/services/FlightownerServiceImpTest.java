package com.hexaware.airticketbooking.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.airticketbooking.entities.FlightOwner;

class FlightownerServiceImpTest {
    FlightownerServiceImp service=new FlightownerServiceImp();
	@Test
	void testInsertFlightOwner() {
		FlightOwner owner=new FlightOwner();
		int actual=service.insertFlightOwner(owner);
		assertEquals(1,actual);
		
	}

	@Test
	void testUpdateFlightOwner() {
		FlightOwner owner=new FlightOwner();
		int actual=service.updateFlightOwner(owner);
		assertEquals(2,actual);
	}

	@Test
	void testDeleteFlightOwner() {
		FlightOwner owner=new FlightOwner();
		int actual=service.deleteFlightOwner(1);
		assertEquals(3,actual);
	}

	@Test
	void testGetByOwnerId() {
		FlightOwner expected=new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com");
		FlightOwner actual=service.getByOwnerId(1);
		assertEquals(expected,actual);
		
		
	}

	@Test
	void testGetAllOwner() {
		List<FlightOwner> expected=new ArrayList<FlightOwner>();
		expected.add(new FlightOwner(1,"uday","kiran@123","6301545095","atuday9@gmail.com"));
		expected.add(new FlightOwner(2,"yash","yash@123","6301545096","yash@gmail.com"));
		List<FlightOwner> actual=service.getAllOwner();
		assertEquals(expected,actual);
	}

}

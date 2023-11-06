package com.hexaware.airticketbooking.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.airticketbooking.entities.Admin;

import junit.framework.Assert;

class AdminServiceImpTest {
    AdminServiceImp service=new AdminServiceImp();
	@Test
	void testInsertAdmin() {
		Admin admin=new Admin();
		int actual=service.insertAdmin(admin);
		assertEquals(5,actual);
	}

	@Test
	void testUpdateAdmin() {
		Admin admin=new Admin();
		int actual=service.updateAdmin(admin);
		assertEquals(10,actual);
		
	}

	@Test
	void testDeleteAdmin() {
		Admin admin=new Admin();
		int actual=service.deleteAdmin(20);
		assertEquals(20,actual);
		
	}

	@Test
	void testGetAdminById() {
		Admin expected=new Admin(20,"uday","Kiran@123");
		Admin actual=service.getAdminById(10);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllAdmin() {
		List<Admin> expected=new ArrayList<Admin>();
		expected.add(new Admin(20,"uday","Uday@123"));
		expected.add(new Admin(30,"kiran","Kiran@123"));
		expected.add(new Admin(40,"surya","surya@123"));
		List<Admin> actual=service.getAllAdmin();
		assertEquals(expected,actual);

}
}
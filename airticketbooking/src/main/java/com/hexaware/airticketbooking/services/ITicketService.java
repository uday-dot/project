package com.hexaware.airticketbooking.services;

import java.util.List;

import com.hexaware.airticketbooking.entities.Admin;
import com.hexaware.airticketbooking.entities.Ticket;
import com.hexaware.airticketbooking.entities.User;

public interface ITicketService {
	public int insertTicket(Ticket ticket);
	public int updateTicket(Ticket ticket);
	public int deleteTicket(int ticketId);
	public User getByTicketId(int ticketId);
	public List<Ticket> getAllTicket();
	
	

}

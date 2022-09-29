package com.springboot.Airport.service;

import java.util.List;

import com.springboot.Airport.model.Airport;

public interface Airportservice {
	
	//save
	Airport saveAirport(Airport airport);
	
	List<Airport> getAllAirports();
	
	Airport getAirportById(long id);
	
	Airport updateAirport(Airport airport, long id);
	
	void deleteAirport(long id);

}

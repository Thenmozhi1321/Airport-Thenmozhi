package com.springboot.Airport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Airport.exception.ResourceNotFoundException;
import com.springboot.Airport.model.Airport;
import com.springboot.Airport.repository.Airportrepository;
@Service
public class AirportserviceImpl implements Airportservice {
	
	@Autowired
	private Airportrepository airportrepository;

	public AirportserviceImpl(Airportrepository airportrepository) {
		super();
		this.airportrepository = airportrepository;
	}

	@Override
	public Airport saveAirport(Airport airport) {
		return airportrepository.save(airport);
	}

	@Override
	public List<Airport> getAllAirports() {
		
		return airportrepository.findAll();
	}

	@Override
	public Airport getAirportById(long id) {
		return airportrepository.findById(id).orElseThrow(  () ->
		new ResourceNotFoundException("Airport","Id",id));
	}

	@Override
	public Airport updateAirport(Airport airport, long id) {
		Airport ap= airportrepository.findById(id).orElseThrow( ()->
		new ResourceNotFoundException("Airport","Id",id));
		ap.setAirportName(airport.getAirportName());
		ap.setAirportLocation(airport.getAirportLocation());
		ap.setAirportCode(airport.getAirportCode());
		airportrepository.save(ap);
		return ap;
	}

	@Override
	public void deleteAirport(long id) {
		airportrepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Airport","Id",id));
		airportrepository.deleteById(id);
		
	}

}

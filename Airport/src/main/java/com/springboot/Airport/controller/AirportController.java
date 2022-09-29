package com.springboot.Airport.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Airport.model.Airport;
import com.springboot.Airport.service.Airportservice;


@RestController
@RequestMapping("/airports")
public class AirportController {
	
	private Airportservice airportservice;

	public AirportController(Airportservice airportservice) {
		super();
		this.airportservice = airportservice;
	}
	
	@PostMapping()
	public ResponseEntity<Airport>addAirport(@RequestBody Airport airport){
		return new ResponseEntity<Airport>(airportservice.saveAirport(airport),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Airport> getAllAirport(){
		return airportservice.getAllAirports();
	}
	@GetMapping("{id}")
	public ResponseEntity<Airport> getAirportById(@PathVariable long id){
		return new ResponseEntity<Airport>(airportservice.getAirportById(id),HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Airport> updateAirport(@PathVariable("id")long id,
		@RequestBody Airport airport){
			return new ResponseEntity<Airport>(airportservice.updateAirport(airport, id),
					HttpStatus.OK);
			
		}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAirport(@PathVariable("id")long id){
		airportservice.deleteAirport(id);
		return new ResponseEntity<String>("Airport was deleted successfully...!",HttpStatus.OK);
	}
	}
	


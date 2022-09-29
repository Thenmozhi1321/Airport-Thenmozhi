package com.springboot.Airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Airport")
public class Airport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Airportid;
	@Column(name="AirportName")
	private String AirportName;
	@Column(name="AirportLocation")
	private String AirportLocation;
	
	@Column(name="Airportcode")
	private String AirportCode;

	public Airport() {
		super();
		
	}

	public Airport(long airportid, String airportName, String airportLocation, String airportCode) {
		super();
		this.Airportid = airportid;
		this.AirportName = airportName;
		this.AirportLocation = airportLocation;
		this.AirportCode = airportCode;
	}

	public long getAirportid() {
		return Airportid;
	}

	public void setAirportid(long airportid) {
		this.Airportid = airportid;
	}

	public String getAirportName() {
		return AirportName;
	}

	public void setAirportName(String airportName) {
		this.AirportName = airportName;
	}

	public String getAirportLocation() {
		return AirportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.AirportLocation = airportLocation;
	}

	public String getAirportCode() {
		return AirportCode;
	}

	public void setAirportCode(String airportCode) {
		this.AirportCode = airportCode;
	}
	

}


	
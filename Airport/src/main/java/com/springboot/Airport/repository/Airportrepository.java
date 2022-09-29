package com.springboot.Airport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.Airport.model.Airport;

@Repository
public interface Airportrepository extends JpaRepository<Airport, Long>{

}

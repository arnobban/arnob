package com.example.AirlineReservationSystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AirlineReservationSystem.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
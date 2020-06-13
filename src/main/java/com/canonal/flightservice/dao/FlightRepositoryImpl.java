package com.canonal.flightservice.dao;

import com.canonal.flightservice.model.Flight;

import java.util.List;

public interface FlightRepositoryImpl {
    List<Flight> getAllFlights();
}

package com.canonal.flightservice.service;

import com.canonal.flightservice.model.Flight;

import java.util.List;

public interface FlightServiceImpl {
    List<Flight> getAllFlights(String searchCriteria, String searchKey);
}

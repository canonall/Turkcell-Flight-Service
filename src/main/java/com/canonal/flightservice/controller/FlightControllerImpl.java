package com.canonal.flightservice.controller;

import com.canonal.flightservice.model.Flight;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FlightControllerImpl {
    List<Flight> getFlights(@RequestParam(required = false) String searchCriteria,@RequestParam(required = false) String searchKey);
}

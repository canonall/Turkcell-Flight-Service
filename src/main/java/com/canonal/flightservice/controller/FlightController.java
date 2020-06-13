package com.canonal.flightservice.controller;

import com.canonal.flightservice.model.Flight;
import com.canonal.flightservice.service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class FlightController implements FlightControllerImpl {

    @Autowired
    FlightServiceImpl flightService;


    @RequestMapping("/flights")
    @Override
    public List<Flight> getFlights(@RequestParam(required = false) String searchCriteria,
                                   @RequestParam(required = false) String searchKey) {

        return flightService.getAllFlights(searchCriteria, searchKey);
    }
}

package com.canonal.flightservice.service;

import com.canonal.flightservice.dao.FlightRepositoryImpl;
import com.canonal.flightservice.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService implements FlightServiceImpl {

    @Autowired
    FlightRepositoryImpl flightRepository;

    @Override
    public List<Flight> getAllFlights(String searchCriteria, String searchKey) {
        List<Flight> flightList = flightRepository.getAllFlights();
        if (searchCriteria == null || searchKey == null)
            return flightList;
        final String key = searchKey.toLowerCase();
        switch (searchCriteria) {
            case "companyName":
                flightList = flightList.stream().filter(flight -> flight.getCompanyName().toLowerCase().contains(key)).collect(Collectors.toList());
                break;
            case "planeModel":
                flightList = flightList.stream().filter(flight -> flight.getPlaneModel().toLowerCase().contains(key)).collect(Collectors.toList());
                break;
            case "flightFrom":
                flightList = flightList.stream().filter(flight -> flight.getFlightFrom().toLowerCase().contains(key)).collect(Collectors.toList());
                break;
            case "flightTo":
                flightList = flightList.stream().filter(flight -> flight.getFlightTo().toLowerCase().contains(key)).collect(Collectors.toList());
                break;
            case "takeOfTime":
                flightList = flightList.stream().filter(flight -> flight.getTakeOffTime().toLowerCase().contains(key)).collect(Collectors.toList());
                break;
            case "all":
                flightList = flightList.stream().filter(flight -> flight.getCompanyName().toLowerCase().contains(key)
                        || flight.getPlaneModel().toLowerCase().contains(key)
                        || flight.getFlightFrom().toLowerCase().contains(key)
                        || flight.getFlightTo().toLowerCase().contains(key)
                        || flight.getTakeOffTime().toLowerCase().contains(key)


                ).collect(Collectors.toList());
                break;
        }

        return flightList;
    }
}

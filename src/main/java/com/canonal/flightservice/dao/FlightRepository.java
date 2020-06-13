package com.canonal.flightservice.dao;

import com.canonal.flightservice.model.Flight;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository implements FlightRepositoryImpl {
    String filePath = "src/main/resources/flights.txt";

    @Override
    public List<Flight> getAllFlights() {
        List<Flight> flightList = new ArrayList<>();
        Flight flight;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();


            while (line != null) {

                //Split string into pieces with regex
                String[] parts = line.split(";");

                //Create flight object from pieces and add to list
                flight = new Flight();
                flight.setCompanyName(parts[0]);
                flight.setPlaneModel(parts[1]);
                flight.setFlightFrom(parts[2]);
                flight.setFlightTo(parts[3]);
                flight.setTakeOffTime(parts[4]);
                flightList.add(flight);

                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flightList;

    }
}

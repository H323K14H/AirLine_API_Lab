package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {

        Flight flight1 = new Flight("Home", 2, "Tomorrow", "3 hours from now");
        flight1.addFlight(flight1);
        flightRepository.save(flight1);

        Flight flight2 = new Flight("Away", 2, "Today", "2 hours from now");
        flight2.addFlight(flight2);
        flightRepository.save(flight2);

        Flight flight3 = new Flight("Here", 2, "Yesterday", "1 hours from now");
        flight3.addFlight(flight3);
        flightRepository.save(flight3);

        Flight flight4 = new Flight("There", 2, "Some day", "6 hours from now");
        flight4.addFlight(flight4);
        flightRepository.save(flight4);
    }
}

package com.kodilla.good.patterns.challenges.Filghts;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    private final Set<Flight> flights;

    public FlightService(Set<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String city) {
        return flights.stream()
                .filter(f -> f.getDepartureCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String city) {
        return flights.stream()
                .filter(f -> f.getArrivalCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<String> findFlightsVia(String departure, String via, String arrival) {
        return flights.stream()
                .filter(f -> f.getDepartureCity().equalsIgnoreCase(departure) && f.getArrivalCity().equalsIgnoreCase(via))
                .flatMap(firstLeg -> flights.stream().filter(secondLeg -> secondLeg.getDepartureCity().equalsIgnoreCase(via) && secondLeg.getArrivalCity().equalsIgnoreCase(arrival)).map(secondLeg -> firstLeg + " | " + secondLeg))
                .collect(Collectors.toList());
    }
}

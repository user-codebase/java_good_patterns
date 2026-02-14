package com.kodilla.good.patterns.challenges.Filghts;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {
    private final Set<Flight> flights = new HashSet<>();

    public FlightRepository() {
        flights.add(new Flight("Gdansk", "Wroclaw"));
        flights.add(new Flight("Wroclaw", "Warszawa"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Krakow", "Wroclaw"));
        flights.add(new Flight("Warszawa", "Gdansk"));
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}

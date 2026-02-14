package com.kodilla.good.patterns.challenges.Filghts;

import java.util.Objects;

public class Flight {
    private final String departureCity;
    private final String arrivalCity;

    public Flight(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Flight flight)) return false;
        return Objects.equals(departureCity, flight.departureCity) && Objects.equals(arrivalCity, flight.arrivalCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity);
    }

    @Override
    public String toString() {
        return departureCity + " -> " + arrivalCity;
    }
}

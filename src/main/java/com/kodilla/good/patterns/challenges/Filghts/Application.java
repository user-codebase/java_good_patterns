package com.kodilla.good.patterns.challenges.Filghts;

public class Application {
    public static void main(String[] args) {
        FlightRepository repository = new FlightRepository();
        FlightService service = new FlightService(repository.getFlights());

        System.out.println("Loty z Gdanska:");
        service.findFlightsFrom("Gdansk").forEach(System.out::println);

        System.out.println("\nLoty do Wroclawia:");
        service.findFlightsTo("Wroclaw").forEach(System.out::println);

        System.out.println("\nLoty z Gdanska przez Krakow do Wroclawia:");
        service.findFlightsVia("Gdansk", "Krakow", "Wroclaw").forEach(System.out::println);
    }
}

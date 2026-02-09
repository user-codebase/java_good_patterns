package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class MovieStore {

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");
        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");
        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        return booksTitlesWithTranslations;
    }

    // Zadanie: funkcyjna iteracja po tytułach (zadanie dodatkowe)
    public static void displayMovieTitles() {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies()
                .entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .map(title -> title + "!")
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        displayMovieTitles();
        System.out.println("\nFactorial result: " + calculateFactorial(5));
    }

    // Zadanie dodatkowe #2 Silnia też jest potężna
    public static int calculateFactorial(int number) {
        return IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
    }
}

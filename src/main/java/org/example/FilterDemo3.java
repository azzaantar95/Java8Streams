package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String args[]) {
        List<String> animals = Arrays.asList("hat", "rat", null, "cat", null, "cow");

        List<String> notNullAnimals = new ArrayList<>();

        notNullAnimals = animals.stream().filter(str -> str != null).collect(Collectors.toList());

        System.out.println(notNullAnimals);
        System.out.println("reading not null the names of animals from arraylist using stream and foreach");

        animals.stream().filter(str -> str != null).forEach(n -> System.out.println(n));
        System.out.println("reading not null the names of animals from arraylist using stream and foreach with method reference");
        animals.stream().filter(str -> str != null).forEach(System.out::println);

    }
}

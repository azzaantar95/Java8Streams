package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// filter the stream based on two conditions
public class FilterDemo2 {

    public static void main(String args[]) {

        List<String> names = Arrays.asList("azza", "Amanhinhhb", "jenafers", "thePhantomOfTheOpera", "tom");

        List<String> longNames = new ArrayList<String>();

        longNames = names.stream().filter(n -> n.length() > 8 && n.length() < 20).collect(Collectors.toList());

        System.out.println(longNames);
        System.out.println("reading long names from arraylist using stream and foreach");
        names.stream().filter(n -> n.length() > 10 && n.length() < 25).forEach(n -> System.out.println(n));

        // using method reference
        System.out.println("reading long names from arraylist using stream and foreach with method reference");
        names.stream().filter(n -> n.length() > 10 && n.length() < 25).forEach(System.out::println);

    }
}

package com.company.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStrings {

    public static void main(String[] args) {

        List<String> animals = Arrays.asList("Zebra", "Tiger", "Crocadile", "Panda");

        List<String> sortedAnimals = animals.stream()
                .sorted()
                .collect(Collectors.toList());


        List<String> reversedOrderAnimal = animals.stream()
                .sorted((str1, str2) -> str2.compareTo(str1))
                .collect(Collectors.toList());

        List<String> reversedComparatorOrderAnimal = animals.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        System.out.println("Without Sort " + animals);
        System.out.println("With Sort " + sortedAnimals);
        System.out.println("With Reversed Sort " + reversedOrderAnimal);
        System.out.println("With Comparator Reversed Sort " + reversedComparatorOrderAnimal);


    }
}

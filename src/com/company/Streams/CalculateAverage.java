package com.company.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class CalculateAverage {


    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(10, 20, 30, 40, 50);

        // calculate the average using streams

        OptionalDouble average = listOfIntegers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        System.out.println(average.orElse(0.0));


    }

}

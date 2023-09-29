package com.company.Streams;

import java.util.Arrays;
import java.util.List;

public class CalculateSumOfEven {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer reduce = integers.stream()
                .filter(value -> value % 2 == 0)
                .reduce(0, (a, b) -> a + b);


        System.out.println("Sum of even numbers " + reduce); // using Reduce

        // using Sum () function

        int sum = integers.stream()
                .filter(value -> value % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers using IntStream SUM " + sum);

    }
}

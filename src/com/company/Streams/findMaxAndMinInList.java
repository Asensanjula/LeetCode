package com.company.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findMaxAndMinInList {

    public static void main(String[] args) {


        List<Integer> integers = Arrays.asList(100, 10, 5, 500);

        Optional<Integer> max = integers.stream()
                .max((a, b) -> a.compareTo(b)); // can use Integer :: Compare as well

        Optional<Integer> min = integers.stream()
                .min((a, b) -> a.compareTo(b)); // can use Integer :: Compare as well

        // other way

        System.out.println("Max value " + max.orElse(0));
        System.out.println("Min value " + min.orElse(0));
    }
}

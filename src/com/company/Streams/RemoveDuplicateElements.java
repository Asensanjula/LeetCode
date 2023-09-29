package com.company.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 2, 2 , 3, 2, 4, 5, 6, 7, 7, 7, 7, 7);

        List<Integer> distinctLis = integers.stream().distinct().collect(Collectors.toList());

        distinctLis.forEach(System.out::println);
    }
}

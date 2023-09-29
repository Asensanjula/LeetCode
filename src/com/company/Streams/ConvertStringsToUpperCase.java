package com.company.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUpperCase {

    public static void main(String[] args) {

        List<String> countryList = Arrays.asList("srilanka", "singapore", "canada", "usa");

        List<String> upperCaseList = countryList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseList);
        upperCaseList.forEach(System.out::println);


    }
}

package com.company.Streams;

import java.util.Arrays;
import java.util.List;

public class CountTheNumberOfString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Orange", "Papaya", "Amma", "Aids");

        long count = list.stream()
                .filter(word -> word.startsWith("A"))
                .count();

        System.out.println("Words Starts with A " + count);

    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestProcessBuilder {

    public static void main(String[] args) throws IOException {

        Process process = new ProcessBuilder("java", "-version").start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//        BufferedReader in = new BufferedReader(new InputStreamReader(new BoundedInputStream(process.getInputStream(), 2048)))

        StringBuilder builder = new StringBuilder();
        String line = null;
        while ( (line = reader.readLine()) != null) {
            builder.append(line);
            builder.append(System.getProperty("line.separator"));
        }
        String result = builder.toString();
        System.out.println(result);
    }
}

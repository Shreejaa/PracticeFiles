package com.java8;

import java.util.Arrays;
import java.util.List;

public class javaStreams5 {
    public static void main(String[] args){
        List<String> avengers = Arrays.asList("wonder women","captian marvel","thor","spiderman","lucy");
        avengers
                .stream()
                .map(String::toUpperCase)
                .filter(x->x.startsWith("C"))
                .forEach(System.out::println);
    }
}

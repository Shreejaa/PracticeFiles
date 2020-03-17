package com.java8;

import java.util.stream.Stream;

public class javaStream2 {
    public static void main(String[] args){
        Stream.of("shree","shiva","sam","usha","saritha")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}

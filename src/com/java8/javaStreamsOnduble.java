package com.java8;

import java.util.stream.Stream;

public class javaStreamsOnduble {
    public static void main(String[] args){
        double value = Stream.of(9.99,18.99,29.87)
                .reduce(0.00,(Double a, Double b)->a+b);
        System.out.println(value);

    }
}

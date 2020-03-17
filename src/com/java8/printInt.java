package com.java8;

import java.util.stream.IntStream;

public class printInt {
    public static void main(String[] args){
        System.out.println(IntStream
                        .range(1,29)
                        //.skip(5)
                        .sum()
                //.forEach(System.out::print);
        );
    }
}

package com.java8;

import java.util.Arrays;

public class javaStreams3 {
    public static void main(String[] args){
        String[] names={"shree","shiva","sam","usha","saritha"};
        Arrays.stream(names)
                .filter(x->x.startsWith("sh"))
                .sorted()
                .forEach(System.out::println);
    }
}

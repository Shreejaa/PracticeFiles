package com.java8;

import java.util.Arrays;

public class javaStreams4 {
    public static void main(String[] args){
        Arrays.stream(new int[] {1,3,4,6,8,9})
                .map(x->x*x)
                .average()
                .ifPresent(System.out::println);
    }
}

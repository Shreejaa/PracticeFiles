package com.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class FuctionalInter {
    public static void main(String[] args){
        Function<Integer,Integer> f= i -> i*i*i;
        System.out.println(f.apply(89));
        System.out.println(f.apply(90));
        Predicate<Integer> p = i -> i%5==0;
        System.out.println(p.test(10));
    }
}

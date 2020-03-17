package com.java8;

import java.util.function.IntPredicate;

public class PredicateExp {

    public static void main(String[] args){
        IntPredicate p1 = i -> i<=13;
        IntPredicate p2 = i -> i>=2;
        System.out.println(p1.and(p2).test(5));
    }
}

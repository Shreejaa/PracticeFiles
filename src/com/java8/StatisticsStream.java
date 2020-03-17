package com.java8;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StatisticsStream {
    public static void main(String[] args){
        IntSummaryStatistics summary = IntStream.of(33,55,66,78,90,87,21)
                .summaryStatistics();
        System.out.println(summary);
    }
}

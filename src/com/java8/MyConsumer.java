package com.java8;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
    public void accept(String s){
        System.out.println(s);
    }
}

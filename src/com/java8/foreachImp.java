package com.java8;

import java.util.ArrayList;
import java.util.List;

public class foreachImp {
    public static void main(String[] args){
        List<String> list  = new ArrayList<String>();
        list.add("mickey");
        list.add("minnie");
        list.add("donald");
        list.forEach(i -> System.out.println(i));
        MyConsumer c = new MyConsumer();
        list.forEach(c);
    }
}

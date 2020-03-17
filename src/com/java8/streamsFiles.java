package com.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsFiles {
    public static void main(String[] args) throws IOException {
        Stream<String> weather = Files.lines(Paths.get("C:\\Users\\Shreejaa_Talla\\Documents\\weather"));
        Map<Integer, String> maps = new HashMap<Integer,String>();
       //long countrows= weather
        maps = weather
                .map(x->x.split(","))
                .filter(x->Double.parseDouble(x[4])<9.0)
               // .count();
        .collect(Collectors.toMap(
                x-> Integer.parseInt(x[0]),
                x-> x[2] ));
        weather.close();
       // System.out.println(countrows);
        for ( Integer key : maps.keySet()){
            System.out.println(key+" "+maps.get(key));
        }
    }
}

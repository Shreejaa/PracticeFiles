package com.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class file2Streams {
    public static void main(String[] args) throws IOException {
        Stream<String> fileLines = Files.lines(Paths.get("C:\\Users\\Shreejaa_Talla\\Documents\\in.txt"));
        fileLines
                .sorted()
                .filter(x->x.length()>12)
                .forEach(System.out::println);
        fileLines.close();
    }
}

package com.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class files2Streams2 {
    public static void main(String[] args) throws IOException {
        List<String> mountains= Files.lines(Paths.get("C:\\Users\\Shreejaa_Talla\\Documents\\in.txt"))
                .filter(x->x.contains("American"))
                .collect(Collectors.toList());
        mountains.forEach(x->System.out.println(x));
    }
}

package com.challenges.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileloading {
    public static void main(String[] args){
        File input;
        File output;
        Scanner scan = new Scanner(System.in);
        Scanner scanFile;
        try {
            input = new File("C:\\Users\\Shreejaa_Talla\\Documents\\veggies.txt");
            output = new File("C:\\Users\\Shreejaa_Talla\\Documents\\veggiesPrice.txt");
            scanFile = new Scanner(input);
            PrintWriter writer = new PrintWriter(output);
            while(scanFile.hasNext()){
                String item = scanFile.nextLine();
                System.out.println("enter the price for the item "+item);
                float price= Float.parseFloat(scan.nextLine());
                writer.println("| "+item+" | "+price+" |" ) ;
            }
            writer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

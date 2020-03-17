package com.challenges.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       List<String> grocery = new ArrayList<>();
       grocery.add("maggie");
       grocery.add("salt");
       grocery.add("spices");
       grocery.add("bread");
       grocery.add("milk");
      boolean x=true;
        while(x){
            System.out.println("enter the grocery item to add or 'quit' to exit  :");
            String gitem = scan.nextLine();
            if(gitem.equals("quit")){
                x=false;
            }else {
                if (grocery.contains(gitem)) {
                    System.out.println("Grocery story contains the item " + gitem);
                } else {
                    grocery.add(gitem);
                }
            }
      }
       System.out.println("Final grocery list "+grocery);
    }
}

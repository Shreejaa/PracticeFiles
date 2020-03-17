package com.company;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr=null;
        try {
            isr = new InputStreamReader(System.in);
            System.out.println("Enter !,'q' to exit");
            char c=' ';
            do {
                c=(char) isr.read();
                System.out.println(c);
            } while (c!='q');
        }finally{
            if(isr!=null){
                isr.close();
            }
        }
    }
}

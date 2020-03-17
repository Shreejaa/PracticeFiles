package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileInputStream in = new FileInputStream("C:\\Users\\Shreejaa_Talla\\Documents\\in.txt");
        FileOutputStream out = new FileOutputStream("C:\\Users\\Shreejaa_Talla\\Documents\\New Text Document.txt");
        System.out.println(in.available());
        int c;
        while ((c=in.read())!=-1){
            out.write(c);
        }
        if(in!=null){
            in.close();
        }if(out!=null){
            out.close();
        }
    }
}

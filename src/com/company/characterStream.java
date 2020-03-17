package com.company;

import java.io.*;

public class characterStream {

    public static void main(String[] args) throws IOException {
        // write your code here
        FileReader in = new FileReader("C:\\Users\\Shreejaa_Talla\\Documents\\in.txt");
        FileWriter out = new FileWriter("C:\\Users\\Shreejaa_Talla\\Documents\\New Text Document.txt");

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

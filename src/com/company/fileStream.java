package com.company;

import java.io.*;

public class fileStream {
    public static void main(String args[]) {

        try {
            byte[] bWrite = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("C:\\Users\\Shreejaa_Talla\\Documents\\New Text Document.txt");
            os.write(bWrite);
            os.close();

            InputStream is = new FileInputStream("C:\\Users\\Shreejaa_Talla\\Documents\\in.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

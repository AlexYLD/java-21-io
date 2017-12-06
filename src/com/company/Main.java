package com.company;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //File file = new File("C:/Users/ayarygix/Desktop/Test.txt");
        InputStream inputStream = new URL("http://google.com").openStream();
        System.out.println("my text");
        //InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        copy(inputStream,outputStream);
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buff = new byte[64 * 1024];
        while (inputStream.available() > 0) {
            int count = inputStream.read(buff);
            outputStream.write(buff, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}

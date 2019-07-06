package com.k001.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileInputStream file = null;
        String path;
        System.out.print("file path: ");
        path = input.nextLine();
        Scanner sc = null;
        try{
            file = new FileInputStream(path);
            sc = new Scanner(file, "UTF-8");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            if(sc.ioException() != null){
                throw sc.ioException();
            }
        } finally {
            if(file != null) file.close();
            if(sc != null) sc.close();
        }
    }
}

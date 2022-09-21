package edu.naja.cap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MyExecptionExample {


    public static void main(String[] args) {
        System.out.println("Program starts");
        Map<String, String> myMap = new HashMap<>();

        String value = myMap.get("Nothing");//null

        InputStream in = null;
        try {
            File file = new File("path");
            in = new FileInputStream(file);//copy file from HD to RAM

            in.read();

            if(value.equals("Anything")){//Null pointer exception
                System.out.println("bla bla true");
            } else {
                System.out.println("bla bla false");
            }

            System.out.println("Program will exit before this line");




        } catch (Exception e){
            //e.printStackTrace();
            System.out.println("There is an error while checking the key: " + e.getMessage());
        } finally {
            //Code is always executed in both cases (Exception or there is no Exception)
            try {
                in.close();
            } catch (Exception e) {
                //throw new RuntimeException(e);
            }
            System.out.println("Code is always executed in both cases (Exception or there is no Exception)");
        }

        System.out.println("Program end");

    }


}

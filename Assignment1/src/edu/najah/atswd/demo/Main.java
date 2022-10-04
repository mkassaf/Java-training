package edu.najah.atswd.demo;


import edu.najah.atswd.demo2.*;
import edu.najah.atswd.demo1.MyClass1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws ParseException {

        Test test = new Test();


        MyClass1 o1 = new MyClass1();
        edu.najah.atswd.demo2.MyClass1 o2 = new edu.najah.atswd.demo2.MyClass1();

        System.out.println("Printing o1 " + o1.toString());
        System.out.println("Printing o2 " + o2);

        o2.printV2();

        o2.print();

        StringBuilder str = new StringBuilder("Hello");
        str.append(" Ahmad " );
        str.append('H');

        String result = str.toString();
        System.out.println(result);





    }
}

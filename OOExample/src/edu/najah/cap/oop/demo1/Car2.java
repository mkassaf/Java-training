package edu.najah.cap.oop.demo1;

import edu.najah.cap.oop.Car;

public class Car2 extends Car {
    public Car2(int id, String name) {
        super(id, name);
    }

    @Override
    protected void printData(){
        super.printData();
        System.out.println("--------- ");
    }



}

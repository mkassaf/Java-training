package edu.najah.cap.oop;

public class Demo {


    public static void main(String[] args) {

        Hundia hundia = new Hundia(1, "Car 1", "2019");

        hundia.getInfo();//

        hundia.printData();




        Car car = new Car(1,"");
        BMW bmw = new BMW(1, "22");

        Car carh = new Hundia(1,"","2020");
        Car carb = new BMW(1,"");


        Hundia huCar = (Hundia) carh;//Type casting


        car = huCar;//it's ok

        System.out.println(huCar.getModel());


    }
}

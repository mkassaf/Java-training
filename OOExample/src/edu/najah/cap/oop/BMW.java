package edu.najah.cap.oop;

public class BMW extends Car {

    public BMW(int id, String name) {
        super(id, name);

    }


    @Override
    public void getInfo(){

        this.printData();
        super.getInfo();//print car
        System.out.println("BMW");
    }

    public static void fun(){
        System.out.println("I am static from bmw");
    }

}

package edu.najah.cap.oop;

public class Car {


    public Car(int id, String name){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    protected void printData(){
        System.out.println("Id " + id + " Name: " + name);
    }

    public void getInfo(){
        printData();//Car - car . BMW ->
        System.out.println("I am a car");
    }

    public static void fun(){
        System.out.println("I am static from car");
    }




}

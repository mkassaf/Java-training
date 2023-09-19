package edu.najah.cap.oo2023.intf;

public class Tv implements Switchable, Connectable {

    public void turnOn() {
        System.out.println("TV: turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("TV: turned off...");
    }

    @Override
    public void connect() {
        System.out.println("TV: connected...");
    }
}

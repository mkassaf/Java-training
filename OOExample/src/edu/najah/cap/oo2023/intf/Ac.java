package edu.najah.cap.oo2023.intf;

public class Ac implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("AC: turned on...");
    }

    public void turnOff() {
        System.out.println("AC: turned off...");
    }
}

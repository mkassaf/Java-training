package edu.najah.cap.oo2023.intf;

public class Lamp implements Switchable {

    public void turnOn() {
        System.out.println("Lamp: turned on...");
    }

    public void turnOff() {
        System.out.println("Lamp: turned off...");
    }
}

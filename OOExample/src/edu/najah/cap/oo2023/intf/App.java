package edu.najah.cap.oo2023.intf;

public class App {

    public static void main(String[] args) {
        Ac ac = new Ac();
        Lamp lamp = new Lamp();
        Tv tv = new Tv();

        trunOn(ac);
        trunOn(lamp);
        trunOn(tv);

        Object connectable = new Tv(); // polymorphism
        Switchable switchable = new Tv(); // polymorphism

        //connectable.connect();
        switchable.turnOn();

        connect(tv);

        if (connectable instanceof Connectable) {
            System.out.println("Tv is connectable");
        }
        if (switchable instanceof Switchable) {
            System.out.println("Tv is Switchable");
        }
        if (switchable instanceof Tv) {
            System.out.println("this is a tv");
        }

    }

    private static void trunOn(Switchable switchable) {
        switchable.turnOn();
    }

    private static void connect(Connectable connectable) {
        connectable.connect();
    }

}

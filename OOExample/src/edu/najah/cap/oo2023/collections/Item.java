package edu.najah.cap.oo2023.collections;

public class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }


    public void print() {
        System.out.println("Item: " + name);
    }
}

package edu.najah.cap.oo2023.inhert;

public class User {

    private int id;
    private String name;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.print("User: " + getId() + " getName:: " + getName());
        System.out.print("User: " + getId() + " getName:: " + getName());
        System.out.print("User: " + getId() + " getName:: " + getName());
        System.out.print("User: " + getId() + " getName:: " + getName());
        System.out.print("User: " + getId() + " getName:: " + getName());
        System.out.print("User: " + getId() + " getName:: " + getName());
        System.out.print("User: " + getId() + " getName:: " + getName());
        System.out.print("User: " + getId() + " getName:: " + getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

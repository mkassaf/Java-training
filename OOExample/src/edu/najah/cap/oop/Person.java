package edu.najah.cap.oop;

public class Person {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getName() {
        //Rules
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            //Throw exception
            //
            System.out.println("Invalid name");
            return;
            //Unreachable code - Static analyzer
            //System.out.println("Unreachable code");
        }
        this.name = name;
    }

    private String name;


    public void printInfo(){
        System.out.println("Name: " + this.name + " Id: " + this.id);
    }


}

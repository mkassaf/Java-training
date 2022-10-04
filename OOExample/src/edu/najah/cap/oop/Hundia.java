package edu.najah.cap.oop;

public class Hundia extends Car {

    public Hundia(int id, String name, String model){
        super(id, name);
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;

    @Override
    protected void printData(){
        //super.printData();
        System.out.println("model " + this.model);
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("I am Hundia");
    }
}

package edu.najah.cap.oo2023.inhert;

public class Student extends User {

    private double gpa;

    public Student(int id, String name, double gpa) {
        super(id, name);
        this.gpa = gpa;
    }

    @Override
    public void print() {
        //call the parent print method
        super.print();
        System.out.println(" gpa:: " + gpa);
    }

    public void print(String message) {
        System.out.println("User: " + getId() + " getName:: " + getName() + " gpa:: " + gpa + " message:: " + message);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

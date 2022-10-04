package edu.najah.eng.cap.model;

import edu.najah.eng.cap.submit.intf.Submit;

import java.util.Date;

public abstract class Student {




    private Submit submitBehaviour;
    private static int addCount = 0;
    private int id;
    private String name;
    private Date dateOfBirth;


    public Student(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        addCount++;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        Date current = new Date();//Now
        return current.getYear() - this.dateOfBirth.getYear();
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof  Student){
            Student student = (Student)object;
            return id == student.getId() && this.name.equals(student.getName());
        }
        return false;
    }


    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("Id: ");
        result.append(id);
        result.append("Name: ");
        result.append(this.getName());
        result.append("Age: ");
        result.append(this.getAge());
        return result.toString();
    }
    public void printInfo() {
        System.out.println("Id " + this.id);
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.getAge());
    }

    public static int getAddCount() {
        return addCount;
    }

    public void submitResearch(String text){
        System.out.println("Accept text : " + text);
        System.out.println("Analysis the text : " + text);
        System.out.println("Preparing the db for ");
        System.out.println("Store this value in Research table ");
    }
    public void submitLab(String text) {
        System.err.println("I am not supporting this operation");
    }


    public void callSubmit(String text){
        submitBehaviour.submit(text);
    }

    public Submit getSubmitBehaviour() {
        return submitBehaviour;
    }

    public void setSubmitBehaviour(Submit submitBehaviour) {
        this.submitBehaviour = submitBehaviour;
    }


}

package edu.najah.eng.cap.model;

import java.util.Date;

public class EngStudent extends  Student{

    public EngStudent(int id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public void submitResearch(String text) {
        System.err.println("I am not supporting this operation");
    }


    public void submitLab(String lab){
        System.out.println("Accept lab : " + lab);
        System.out.println("Analysis the lab : " + lab);
        System.out.println("Preparing the db for lab");
        System.out.println("Store this value in Lab table ");
    }
}

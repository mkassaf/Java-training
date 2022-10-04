package edu.najah.eng.cap.model;

import edu.najah.eng.cap.constants.BADegree;
import edu.najah.eng.cap.submit.intf.Submit;

import java.util.Date;

public class MasterStudent extends Student implements Submit {


    private BADegree baDegree;



    private String supervisor;

    public BADegree getBaDegree() {
        return baDegree;
    }

    public void setBaDegree(BADegree baDegree) {
        this.baDegree = baDegree;
    }



    public MasterStudent(int id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    public String getSupervisor(){
        return this.supervisor;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    @Override
    public boolean equals(Object object){
        if (object instanceof  MasterStudent){
            MasterStudent student = (MasterStudent)object;
            return super.equals(object) && this.baDegree.equals(student.getBaDegree());
        }
        return false;
    }


    @Override
    public void submit(String text) {
        System.out.println("Accept text : " + text);
        System.out.println("Analysis the text : " + text);
        System.out.println("Preparing the db for ");
        System.out.println("Store this value in Research table ");
    }
}

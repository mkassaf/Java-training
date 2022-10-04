package edu.najah.eng.cap.model;

import edu.najah.eng.cap.submit.intf.Submit;

import java.util.Date;

public class MedicalStudent extends Student  implements Submit {


    public MedicalStudent(int id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public void submit(String text) {
        System.out.println("Accept text : " + text);
        System.out.println("Analysis the text : " + text);
        System.out.println("Preparing the db for ");
        System.out.println("Store this value in Research table ");
    }

}

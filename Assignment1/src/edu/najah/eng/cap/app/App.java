package edu.najah.eng.cap.app;

import edu.najah.eng.cap.model.MasterStudent;
import edu.najah.eng.cap.model.MedicalStudent;
import edu.najah.eng.cap.model.Student;
import edu.najah.eng.cap.submit.impl.Lab;
import edu.najah.eng.cap.submit.impl.Research;
import edu.najah.eng.cap.submit.intf.Submit;

import java.text.DateFormat;
import java.util.Date;
import java.util.Formatter;

public class App {

    public static void main(String[] args) {
        int id = 2;
        University university = new University();
        Student engStudent = university.addStudent(1, "Assaf", new Date(), "Eng");

        engStudent.setSubmitBehaviour(new Lab());

        Student masterStd = university.addStudent(2, "Rami", new Date(""), "Master");

        masterStd.setSubmitBehaviour(new Research());

        masterStd.setSubmitBehaviour(text -> {
            System.out.println("Submitting text extra");
        });


        engStudent.callSubmit("eeee");//will be store in Lab table
        masterStd.callSubmit("eeee");//will be store in Lab Research

        if (masterStd instanceof Submit){
            Submit submit = (Submit)masterStd;
            submit.submit("sss");
        }





    }









}

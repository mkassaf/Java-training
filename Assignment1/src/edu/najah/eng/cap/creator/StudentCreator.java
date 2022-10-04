package edu.najah.eng.cap.creator;

import edu.najah.eng.cap.model.EngStudent;
import edu.najah.eng.cap.model.MasterStudent;
import edu.najah.eng.cap.model.MedicalStudent;
import edu.najah.eng.cap.model.Student;

import java.util.Date;

public class StudentCreator {
    public static Student createStudent(int id, String name, Date age, String type) {
        Student newStudent = null;

        if (type.equals("Master")){
            newStudent = new MasterStudent(id, name, age);
        } else if (type.equals("Eng")){
            newStudent = new EngStudent(id, name, age);
        } else if (type.equals("Medical")){
            newStudent = new MedicalStudent(id, name, age);
        } else if (type.equals("Art")){
            //newStudent = new ArtStudent(id, name, age);
        }

        return newStudent;
    }
}

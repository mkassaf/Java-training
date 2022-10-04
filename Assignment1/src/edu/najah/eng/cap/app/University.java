package edu.najah.eng.cap.app;

import edu.najah.eng.cap.creator.StudentCreator;
import edu.najah.eng.cap.model.EngStudent;
import edu.najah.eng.cap.model.MasterStudent;
import edu.najah.eng.cap.model.MedicalStudent;
import edu.najah.eng.cap.model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class University {
    private List<Student> students = null;
    private static int addCounter = 0;
    private static int removeCounter = 0;
    private static int readCounter = 0;

    public University(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        addCounter++;
        students.add(student);
    }


    public Student addStudent(int id, String name, Date age,String type){
        Student newStudent = StudentCreator.createStudent( id,  name,  age, type);
        students.add(newStudent);
        return newStudent;
    }

    public Student getStudent(int id){
        Student result = null;
        for (Student student : students) {
            if (student.getId() == id){
                result = student;
                break;
            }
        }
        if (result == null){
            System.err.println("Unable to find student with id = "+ id);
        }
        return result;
    };


    public void printAll(){
        for (Student student : students) {
            student.printInfo();
            System.out.println(student);
        }
        Student.getAddCount();
    }








}

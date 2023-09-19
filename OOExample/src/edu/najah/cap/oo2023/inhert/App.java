package edu.najah.cap.oo2023.inhert;

import edu.najah.cap.oo2023.inhert.Student;
import edu.najah.cap.oo2023.inhert.User;

public class App {


    public static void main(String[] args) {

        User user = new User(1, "Ahmad");

        user.print();

        Student student = new Student(2, "Ahmad", 3.5);

        student.print();
        student.print("Hello");

        User user1 = student;

        User user2 = new Student(3, "User 2", 3.9);

        user2.print();// polymorphism - dynamic binding

        ((Student)user2).print("Hello");

        Object object = new Student(4, "Object", 3.9);

        ((Student)object).print();

       Student student4 = (Student) object;
       student4.print();


        User user3 = new User(5, "User 3");

        //Student student5 = (Student) user3; // runtime error - ClassCastException


    }
}

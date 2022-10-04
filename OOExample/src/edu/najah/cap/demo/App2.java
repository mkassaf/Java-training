package edu.najah.cap.demo;

import edu.najah.cap.oop.abstraction.DatasbeAbst;
import edu.najah.cap.oop.abstraction.MySqlDB;

public class App2 {

    public static void main(String[] args) {


        DatasbeAbst db = new MySqlDB("najah.edu:3030");
        db.getData("Select * from students");

    }
}

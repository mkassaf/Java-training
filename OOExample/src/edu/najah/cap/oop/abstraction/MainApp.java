package edu.najah.cap.oop.abstraction;

import java.util.ArrayList;

public class MainApp {


    public static void main(String[] args) {

        Database mySqlDatabase = new MySqlDatabase();
        Database sqLiteDatabase = new SQLiteDatabase();
        Database postgresDatabase = new PostgresDatabase();
        getData(mySqlDatabase, "");
        getData(sqLiteDatabase, "");
        getData(postgresDatabase, "");


        Database object = new Database() {
            @Override
            public void connect(String query) {
                System.out.println("connect inline class");
            }

            @Override
            public ArrayList<Object> executeQuery(String query) {
                System.out.println("connect inline query" + query);
                return null;
            }

            @Override
            public void close() {
                System.out.println("close" );
            }
        };


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am new class 1");
            }
        };

        runnable.run();

        Runnable runnable2 = () -> {
            System.out.println("I am new class 2");
        };

        runnable2.run();



        DatasbeAbst db = new MySqlDB("najah.edu:3030");



        db.getData("Select * from students");

        db.connect();//
    }


    /**
     * this function depends on abstraction
     * too large
     * @param db
     */
    public static ArrayList<Object> getData(Database db, String query){
        ArrayList<Object> result = null;
        try {
            db.connect("12.3.34.3:3049/db");
            result = db.executeQuery(query);
        } catch (Exception e){
            System.err.println("There is an error while connection to db " + e.getMessage());
        } finally {
            try {
                if (db != null ){
                    db.close();
                }
            } catch (Exception e){
                System.err.println("Error while closing the connection" + e.getMessage());
            }

        }
        return result;

    }

}

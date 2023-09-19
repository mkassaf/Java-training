package edu.najah.cap.oo2023.abst;

public class App {


    public static void main(String[] args) {
        Template jobA = new JobA();
        callJob(jobA);
        callJob(new JobB());
        callJob(new JobD());

        Template template = new JobA();
        callJob(template);

    }

    public static void callJob(Template job) {
        job.proccess();
    }


}

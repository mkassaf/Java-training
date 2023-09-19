package edu.najah.cap.oo2023.abst;

public class JobA extends Template {

    protected void step1() {
        System.out.println("JobA step1");
    }

    @Override
    protected void step2() {
        System.out.println("JobA step2");
    }

    @Override
    protected void step3() {
        System.out.println("JobA step3");
    }
}

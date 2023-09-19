package edu.najah.cap.oo2023.abst;

public abstract class Template {

    public final void proccess() {
        step1();
        step2();
        step3();
    }

    protected abstract void step1();

    protected abstract void step2();

    protected abstract void step3();
}

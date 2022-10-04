package edu.najah.eng.cap.submit.impl;

import edu.najah.eng.cap.submit.intf.Submit;

public class Research implements Submit {
    @Override
    public void submit(String text) {
        System.out.println("Accept text : " + text);
        System.out.println("Analysis the text : " + text);
        System.out.println("Preparing the db for ");
        System.out.println("Store this value in Research table ");
    }
}

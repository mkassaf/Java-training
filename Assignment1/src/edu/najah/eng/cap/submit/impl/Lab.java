package edu.najah.eng.cap.submit.impl;

import edu.najah.eng.cap.submit.intf.Submit;

public class Lab implements Submit {
    @Override
    public void submit(String lab) {
        System.out.println("Accept lab : " + lab);
        System.out.println("Analysis the lab : " + lab);
        System.out.println("Preparing the db for lab");
        System.out.println("Store this value in Lab table ");
    }
}

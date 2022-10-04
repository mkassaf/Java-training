package edu.najah.eng.cap.coffee.example;

import java.util.ArrayList;
import java.util.List;

public class Coffee {

    public List<Extra> getExtra() {
        return extra;
    }

    private List<Extra> extra;


    public Coffee(){
        extra = new ArrayList<>();
    }
    private static final int COFFEE_COST = 3;

    public int getCost(){
        int total = 0;
        for (Extra extra1 : extra) {
            total = extra1.getCost();
        }
        return COFFEE_COST + total;
    }
}

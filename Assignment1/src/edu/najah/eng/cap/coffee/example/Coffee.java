package edu.najah.eng.cap.coffee.example;

import edu.najah.eng.cap.constants.PriceList;

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

    public int getCost(){
        int total = PriceList.COFFEE.price; // set it initially to the price of the coffee
        for (Extra extra1 : extra) {
            total = extra1.getCost();
        }
        return total;
    }
}

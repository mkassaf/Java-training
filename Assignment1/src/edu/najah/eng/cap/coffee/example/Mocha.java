package edu.najah.eng.cap.coffee.example;

import edu.najah.eng.cap.constants.PriceList;

public class Mocha implements Extra{
    @Override
    public int getCost() {
        return PriceList.COFFEE_WITH_MOCHA.price;
    }
}

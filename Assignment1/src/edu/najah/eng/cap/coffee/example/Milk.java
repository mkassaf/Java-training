package edu.najah.eng.cap.coffee.example;

import edu.najah.eng.cap.constants.PriceList;

public class Milk implements Extra {
    @Override
    public int getCost() {
        return PriceList.COFFEE_WITH_MILK.price;
    }
}

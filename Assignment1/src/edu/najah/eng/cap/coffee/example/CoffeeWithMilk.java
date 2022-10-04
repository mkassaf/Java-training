package edu.najah.eng.cap.coffee.example;

import edu.najah.eng.cap.constants.PriceList;

public class CoffeeWithMilk extends Coffee {

    @Override
    public int getCost(){
        return super.getCost() + PriceList.COFFEE_WITH_MILK.price;
    }
}

package edu.najah.eng.cap.coffee.example;

public class CoffeeWithMilk extends Coffee {


    private static final int COFFEE_WITH_MILK_COST = 1;

    @Override
    public int getCost(){
        return super.getCost() + COFFEE_WITH_MILK_COST;
    }
}

package edu.najah.eng.cap.coffee.example;

public class CoffeeWithButter extends Coffee{


    private static final int COFFEE_WITH_BUTTER_COST = 2;

    @Override
    public int getCost(){
        return super.getCost() + COFFEE_WITH_BUTTER_COST;
    }
}

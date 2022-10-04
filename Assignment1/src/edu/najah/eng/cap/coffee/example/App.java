package edu.najah.eng.cap.coffee.example;

public class App {

    public static void main(String[] args) {
        Coffee coffee =  new Coffee();
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk();

        System.out.println("Cost without Extra: " + coffee.getCost());
        coffee.getExtra().add(new Milk());

        System.out.println("Cost with Milk: " + coffee.getCost() + " Which equals to " + coffeeWithMilk.getCost());


        coffee.getExtra().add(new Mocha());
        System.out.println("Cost with milk and mocha: " + coffee.getCost());

        coffee.getExtra().add(new Milk());
        System.out.println("Cost with 2 milk and mocha: " + coffee.getCost());
    }
}

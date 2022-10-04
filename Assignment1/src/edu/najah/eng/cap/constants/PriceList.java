package edu.najah.eng.cap.constants;

public enum PriceList {
    COFFEE(3),
    COFFEE_WITH_MILK(1),
    COFFEE_WITH_MOCHA(2),
    COFFEE_WITH_BUTTER(2);


    public final int price;

    PriceList(int price) {
        this.price = price;
    }
}

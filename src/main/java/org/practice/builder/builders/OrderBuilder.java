package org.practice.builder.builders;

import org.practice.builder.components.Beverage;
import org.practice.builder.components.Dessert;
import org.practice.builder.components.MainDish;
import org.practice.builder.orders.Order;

public class OrderBuilder implements Builder{
    private MainDish mainDish;
    private Dessert dessert;
    private Beverage beverage;
    @Override
    public void setMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Order getResult(){
        return new Order(mainDish, dessert, beverage);
    }
}

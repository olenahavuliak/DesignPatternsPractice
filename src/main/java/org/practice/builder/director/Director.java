package org.practice.builder.director;

import org.practice.builder.builders.Builder;
import org.practice.builder.components.Beverage;
import org.practice.builder.components.Dessert;
import org.practice.builder.components.MainDish;
import org.practice.builder.components.enumerations.BeverageSize;
import org.practice.builder.components.enumerations.BeverageType;
import org.practice.builder.components.enumerations.DessertType;

public class Director {
    public void createFullOrder(Builder builder){
        builder.setBeverage(new Beverage("Latte", BeverageType.COFFEE, BeverageSize.MIDDLE, 1));
        builder.setDessert(new Dessert("Cheese cake", DessertType.CAKE, "without blueberries", 2));
        builder.setMainDish(new MainDish("Pasta", "without mushrooms", 1));
    }

    public void createDessertOrder(Builder builder){
        builder.setDessert(new Dessert("Tiramisu", DessertType.CAKE, "allergy to nuts", 1));
        builder.setBeverage(new Beverage("Green tea", BeverageType.TEA, BeverageSize.SMALL, 1));
        builder.setMainDish(null);
    }
}

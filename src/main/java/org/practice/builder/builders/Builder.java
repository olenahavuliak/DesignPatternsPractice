package org.practice.builder.builders;

import org.practice.builder.components.Beverage;
import org.practice.builder.components.Dessert;
import org.practice.builder.components.MainDish;

public interface Builder {
    void setMainDish(MainDish mainDish);
    void setDessert(Dessert dessert);
    void setBeverage(Beverage beverage);
}

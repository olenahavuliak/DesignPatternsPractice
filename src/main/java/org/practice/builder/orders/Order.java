package org.practice.builder.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.practice.builder.components.Beverage;
import org.practice.builder.components.Dessert;
import org.practice.builder.components.MainDish;

@AllArgsConstructor
@Getter
public class Order {
    private final MainDish mainDish;
    private final Dessert dessert;
    private final Beverage beverage;

    @Override
    public String toString() {
        String order = "";
        if (mainDish != null) {
            order += "\nmain dish =" + mainDish;
        }
        if (dessert != null) {
            order += "\ndessert =" + dessert;
        }
        if (beverage != null) {
            order += "\nbeverage =" + beverage;
        }
        return order;
    }
}

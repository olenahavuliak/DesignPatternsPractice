package org.practice.builder;

import org.practice.builder.builders.OrderBuilder;
import org.practice.builder.director.Director;
import org.practice.builder.orders.Order;

public class Main {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();
        Director director = new Director();
        director.createFullOrder(orderBuilder);
        Order fullOrder = orderBuilder.getResult();
        System.out.println("\nOrder with main dish" + fullOrder);

        director.createDessertOrder(orderBuilder);
        Order dessertOrder = orderBuilder.getResult();
        System.out.println("\nOrder without main dish" + dessertOrder);

    }
}

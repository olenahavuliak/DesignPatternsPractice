package org.practice.builder.components;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MainDish {
    private String name;
    private String notes;
    private int amount;

    @Override
    public String toString() {
        return " main dish {" +
                "name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", amount=" + amount +
                '}';
    }
}

package org.practice.builder.components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.practice.builder.components.enumerations.DessertType;
@AllArgsConstructor
@Getter
public class Dessert {
    private String name;
    private DessertType type;
    private String notes;
    private int amount;

    @Override
    public String toString() {
        return " dessert {" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", notes='" + notes + '\'' +
                ", amount=" + amount +
                '}';
    }
}

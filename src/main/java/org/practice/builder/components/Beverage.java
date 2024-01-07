package org.practice.builder.components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.practice.builder.components.enumerations.BeverageSize;
import org.practice.builder.components.enumerations.BeverageType;

@AllArgsConstructor
@Getter
public class Beverage {
    private String name;
    private BeverageType type;
    private BeverageSize size;
    private int amount;

    @Override
    public String toString() {
        return " beverage{ " +
                "name='" + name + '\'' +
                ", type=" + type +
                ", size=" + size +
                ", amount=" + amount +
                '}';
    }
}

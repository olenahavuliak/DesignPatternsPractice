package org.practice.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public abstract class Animal {
    private String name;
    private int age;
    private GeneralType type;

    public Animal(){}

    public Animal(Animal target){
        this.age = target.age;
        this.name = target.name;
        this.type = target.type;
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && type == animal.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
    }
}

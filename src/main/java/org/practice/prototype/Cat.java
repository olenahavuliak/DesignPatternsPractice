package org.practice.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Cat extends Animal{
    private String color;
    private String breed;

    public Cat(){}

    public Cat(Cat target){
        super(target);
        this.color = target.color;
        this.breed = target.breed;
    }
    @Override
    public Animal clone() {
        return new Cat(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, breed);
    }
}

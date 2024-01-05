package org.practice.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Wolf extends Animal{
    private String coatColor;
    private String habitat;

    public Wolf(){}

    public Wolf(Wolf target){
        super(target);
        this.coatColor = target.coatColor;
        this.habitat = target.habitat;
    }

    @Override
    public Animal clone() {
        return new Wolf(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(coatColor, wolf.coatColor) && Objects.equals(habitat, wolf.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coatColor, habitat);
    }
}

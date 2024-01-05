package org.practice.prototype;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Bella");
        cat.setAge(2);
        cat.setType(GeneralType.DOMESTIC);


        Cat clone = new Cat(cat);

        if(cat.equals(clone)){
            System.out.println("Cats are identical!");
        }
        else {
            System.out.println("Bebe");
        }

        Wolf wolf = new Wolf();
        wolf.setName("Name");
        wolf.setHabitat("Habitat");
        wolf.setType(GeneralType.DOMESTIC);

        Wolf cloneWolf = new Wolf(wolf);
        if(wolf.equals(cloneWolf))
            System.out.println("Wolfs are the same.");
        else
            System.out.println("Bebe");
    }
}

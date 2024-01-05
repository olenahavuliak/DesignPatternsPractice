package org.practice.factory_method.engines;

public class AudiEngine implements Engine {
    @Override
    public void construct() {
        System.out.println("Audi engine constructed.");
    }
}

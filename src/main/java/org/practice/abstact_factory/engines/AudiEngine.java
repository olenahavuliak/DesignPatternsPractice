package org.practice.abstact_factory.engines;

public class AudiEngine implements Engine{
    @Override
    public void construct() {
        System.out.println("Audi engine constructed.");
    }
}

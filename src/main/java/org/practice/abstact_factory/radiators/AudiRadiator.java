package org.practice.abstact_factory.radiators;

public class AudiRadiator implements Radiator{
    @Override
    public void construct() {
        System.out.println("Audi radiator constructed.");
    }
}

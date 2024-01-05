package org.practice.abstact_factory.radiators;

public class BmwRadiator implements Radiator{
    @Override
    public void construct() {
        System.out.println("Bmw radiator constructed.");
    }
}

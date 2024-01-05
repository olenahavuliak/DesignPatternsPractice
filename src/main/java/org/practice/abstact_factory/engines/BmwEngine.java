package org.practice.abstact_factory.engines;

public class BmwEngine implements Engine{
    @Override
    public void construct() {
        System.out.println("Bmw engine constructed.");
    }
}

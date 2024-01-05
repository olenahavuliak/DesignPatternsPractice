package org.practice.factory_method.engines;

public class BmwEngine implements Engine {
    @Override
    public void construct() {
        System.out.println("Bmw engine constructed.");
    }
}

package org.practice.abstact_factory;

import org.practice.abstact_factory.engines.Engine;
import org.practice.abstact_factory.factory.CarFactory;
import org.practice.abstact_factory.factory.CarType;
import org.practice.abstact_factory.factory.FactoryCreator;
import org.practice.abstact_factory.radiators.Radiator;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = FactoryCreator.getFactory(CarType.AUDI);
        Engine engine = carFactory.createEngine();
        Radiator radiator = carFactory.createRadiator();
        engine.construct();
        radiator.construct();

    }
}

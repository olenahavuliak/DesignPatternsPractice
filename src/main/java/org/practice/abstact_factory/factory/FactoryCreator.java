package org.practice.abstact_factory.factory;

public class FactoryCreator {
    public static CarFactory getFactory(CarType choice){
        if(choice.equals(CarType.BMW))
            return new BmwFactory();
        if(choice.equals(CarType.AUDI))
            return new AudiFactory();
        else return null;
    }
}

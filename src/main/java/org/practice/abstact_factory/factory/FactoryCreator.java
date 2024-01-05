package org.practice.abstact_factory.factory;

public class FactoryCreator {
    public static CarFactory getFactory(String choice){
        if(choice.equals("BMW"))
            return new BmwFactory();
        if(choice.equals("Audi"))
            return new AudiFactory();
        else return null;
    }
}

package org.practice.factory_method;

import org.practice.factory_method.factory.AudiEngineFactory;
import org.practice.factory_method.factory.BmwEngineFactory;
import org.practice.factory_method.factory.EngineFactory;

public class Main {
    public static void main(String[] args) {
        EngineFactory audiEngineFactory = new AudiEngineFactory();
        audiEngineFactory.construct();

        EngineFactory bmwEngineFactory = new BmwEngineFactory();
        bmwEngineFactory.construct();
    }
}

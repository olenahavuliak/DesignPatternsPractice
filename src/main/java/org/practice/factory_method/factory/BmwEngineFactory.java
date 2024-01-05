package org.practice.factory_method.factory;

import org.practice.factory_method.engines.BmwEngine;
import org.practice.factory_method.engines.Engine;

public class BmwEngineFactory extends EngineFactory{
    @Override
    public Engine create() {
        return new BmwEngine();
    }
}

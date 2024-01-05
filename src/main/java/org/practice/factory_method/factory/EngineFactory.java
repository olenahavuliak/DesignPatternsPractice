package org.practice.factory_method.factory;

import org.practice.factory_method.engines.Engine;

public abstract class EngineFactory {
    public void construct(){
        Engine engine = create();
        engine.construct();
    }
    public abstract Engine create();
}

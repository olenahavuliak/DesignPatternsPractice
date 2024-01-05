package org.practice.factory_method.factory;

import org.practice.factory_method.engines.AudiEngine;
import org.practice.factory_method.engines.Engine;

public class AudiEngineFactory extends EngineFactory {
    @Override
    public Engine create() {
        return new AudiEngine();
    }
}

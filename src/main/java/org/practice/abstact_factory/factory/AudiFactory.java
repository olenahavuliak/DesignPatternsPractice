package org.practice.abstact_factory.factory;

import org.practice.abstact_factory.engines.AudiEngine;
import org.practice.abstact_factory.engines.Engine;
import org.practice.abstact_factory.radiators.AudiRadiator;
import org.practice.abstact_factory.radiators.Radiator;

public class AudiFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Radiator createRadiator() {
        return new AudiRadiator();
    }
}

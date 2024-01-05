package org.practice.abstact_factory.factory;

import org.practice.abstact_factory.engines.BmwEngine;
import org.practice.abstact_factory.engines.Engine;
import org.practice.abstact_factory.radiators.BmwRadiator;
import org.practice.abstact_factory.radiators.Radiator;

public class BmwFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new BmwEngine();
    }

    @Override
    public Radiator createRadiator() {
        return new BmwRadiator();
    }
}

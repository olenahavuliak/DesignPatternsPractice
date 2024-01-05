package org.practice.abstact_factory.factory;

import org.practice.abstact_factory.engines.Engine;
import org.practice.abstact_factory.radiators.Radiator;

public interface CarFactory {
    Engine createEngine();
    Radiator createRadiator();
}

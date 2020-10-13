package pattern.design.factory.car.impl;

import pattern.design.factory.car.Car;

public class Ferrari implements Car {
    static final String DESCRIPTION = "Esse carro é uma Ferrari.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

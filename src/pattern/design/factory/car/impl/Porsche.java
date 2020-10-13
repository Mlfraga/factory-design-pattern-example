package pattern.design.factory.car.impl;

import pattern.design.factory.car.Car;

public class Porsche implements Car {
    static final String DESCRIPTION = "Esse carro é uma Porsche.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

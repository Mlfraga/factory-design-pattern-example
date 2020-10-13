package pattern.design.factory.calculation.impl;

import pattern.design.factory.calculation.Calculation;

public class FiftyPercentDiscount implements Calculation {

    private static final double PERCENTAGE = 0.5;

    @Override
    public double calculate(double price) {
        return price * PERCENTAGE;
    }
}

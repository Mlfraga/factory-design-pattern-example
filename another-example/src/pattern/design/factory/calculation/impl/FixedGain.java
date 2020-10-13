package pattern.design.factory.calculation.impl;

import pattern.design.factory.calculation.Calculation;

public class FixedGain implements Calculation {

    private static final double GAIN_FIXED = 10;

    @Override
    public double calculate(double price) {
        return price + GAIN_FIXED;
    }
}

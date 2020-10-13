package com.company.Calculations;

public class FixedGain implements Calculation {

    private final double gainFixed = 10;

    @Override
    public double gainCalculation (double price) {
        return price + gainFixed;
    }
}

package com.company.Calculations;

public class HalfDiscount implements Calculation {

    private final double halfDiscount = 2;

    @Override
    public double gainCalculation(double price) {
        return price / halfDiscount;
    }
}

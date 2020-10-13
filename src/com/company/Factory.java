package com.company;

import com.company.Calculations.Calculation;
import com.company.Calculations.FixedGain;
import com.company.Calculations.HalfDiscount;

public class Factory {
    public static Calculation createCalculation (String calulationType) {

        switch (calulationType) {

            case "FIXED":
                return new FixedGain();

            case "HALF":
                return new HalfDiscount();

            default:
                return null;

        }
    }
}

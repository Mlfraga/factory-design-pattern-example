package pattern.design.factory.calculation;

public class CalculationFactory {
    public static Calculation getCalculation (CalculationType type) {
        return type.getConstructor().get();
    }
}

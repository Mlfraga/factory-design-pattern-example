package pattern.design.factory.car;

public class CarsFactory {
    public static Car getCar(CarType type) {
        return type.getConstructor().get();
    }
}

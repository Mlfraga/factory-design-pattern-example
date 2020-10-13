package pattern.design.factory.car;
import pattern.design.factory.car.impl.Ferrari;
import pattern.design.factory.car.impl.Porsche;

import java.util.function.Supplier;

public enum CarType {
    PORSCHE(Porsche::new),
    FERRARI(Ferrari::new);

    private final Supplier<Car> constructor;

    CarType(Supplier<Car> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return this.constructor;
    }
}

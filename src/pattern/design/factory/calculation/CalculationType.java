package pattern.design.factory.calculation;

import pattern.design.factory.calculation.impl.FiftyPercentDiscount;
import pattern.design.factory.calculation.impl.FixedGain;

import java.util.function.Supplier;

public enum CalculationType {
  
    FIXED_GAIN(FixedGain::new),
    FIFTY_PERCENT_DISCOUNT(FiftyPercentDiscount::new);
    
    private final Supplier<Calculation> constructor;
    
    CalculationType(Supplier<Calculation> constructor) {
      this.constructor = constructor;
    }
    
    public Supplier<Calculation> getConstructor() {
      return this.constructor;
    }
  }
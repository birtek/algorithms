package patterns.strategy.domain;

import java.math.BigDecimal;

public class Vat32 implements Vat {
    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.32));
    }
}

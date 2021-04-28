package patterns.strategy.domain;

import java.math.BigDecimal;

public interface Vat {

    BigDecimal calculate(BigDecimal price);
}

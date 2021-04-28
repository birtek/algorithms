package patterns.strategy.domain;

import java.math.BigDecimal;

public class CD {
    private BigDecimal price;

    public CD(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal price(Vat vat) {
        return price.add(vat.calculate(price));
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

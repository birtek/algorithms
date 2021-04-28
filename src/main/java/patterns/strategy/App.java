package patterns.strategy;

import patterns.strategy.domain.CD;
import patterns.strategy.domain.Vat;
import patterns.strategy.domain.Vat32;
import patterns.strategy.domain.Vat7;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        CD cd =new CD(new BigDecimal(10));
        Vat vat = new Vat32();
        System.out.println("Price with taxes = " + cd.price(vat));

        BigDecimal amount = new BigDecimal("123.45");
        BigDecimal more = BigDecimal.valueOf(12.34);
        amount.add(more);
        System.out.println(amount.add(more));
        System.out.println("Money = " + amount);
        amount = amount.add(more);
        System.out.println("Correct money = " + amount);
    }
}

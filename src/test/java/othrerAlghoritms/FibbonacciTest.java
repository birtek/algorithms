package othrerAlghoritms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibbonacciTest {

    @Test
    public void testFiboRecu0() {
        Assert.assertEquals(Fibbonacci.fiboRecu(0), 0);
    }

    @Test
    public void testFiboRecu5() {
        Assert.assertEquals(Fibbonacci.fiboRecu(5), 5);
    }

    @Test
    public void testFiboRecu20() {
        Assert.assertEquals(Fibbonacci.fiboRecu(20), 6765);
    }

    @Test
    public void testFiboDynamic0() {
        Assert.assertEquals(Fibbonacci.fibodynamic(0), 0);
    }

    @Test
    public void testFiboDynamic5() {
        Assert.assertEquals(Fibbonacci.fibodynamic(5), 5);
    }

    @Test
    public void testFiboDynamic20() {
        Assert.assertEquals(Fibbonacci.fibodynamic(20), 6765);
    }
}
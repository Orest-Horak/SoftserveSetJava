import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalcTest {

    private Calc calculate = new Calc();
    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculate.sum(2,3));
        assertEquals(6, calculate.multiply(2,3));
        assertEquals(5, calculate.substract(8,3));
        assertEquals(5, calculate.divide(10,2));
    }
}
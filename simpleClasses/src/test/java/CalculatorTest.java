import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator( 10.00, 5.00);
    }


    @Test
    public void addNum() {
        assertEquals(15, calculator.add(),  0.01);
    }

    @Test
    public void subtractNum() {
        assertEquals(5, calculator.subtract(), 0.01);
    }

    @Test
    public void multiplyNum() {
        assertEquals(50, calculator.multiply(), 0.01);
    }

    @Test
    public void divideNum() {
        assertEquals(2, calculator.divide(), 0.01);
    }

}

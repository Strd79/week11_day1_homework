import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(14, calculator.Add(6, 8));
    }

    @Test
    public void canSubtract() {
        assertEquals(8, calculator.Subtract(12, 4));
    }

    @Test
    public void canMultiply() {
        assertEquals(80, calculator.Multiply(10, 8));
    }

    @Test public void canDivide() {
        assertEquals(13.2, calculator.Divide(66.0, 5.0), 0.01);
    }

}

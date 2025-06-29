package Week_2.JUnit_Mockito_SL4J.JUnit_basic.setup_Junit.src.test.java;

import Week_2.JUnit_Mockito_SL4J.JUnit_basic.setup_Junit.src.main.java.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testSub(){
        Calculator calc = new Calculator();
        int result = calc.sub(7,5);
        assertEquals(2,result);
    }
}

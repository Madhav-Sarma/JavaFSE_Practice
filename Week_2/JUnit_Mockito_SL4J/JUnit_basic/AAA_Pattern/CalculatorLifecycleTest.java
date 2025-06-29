package Week_2.JUnit_Mockito_SL4J.JUnit_basic.AAA_Pattern;

import Week_2.JUnit_Mockito_SL4J.JUnit_basic.setup_Junit.src.main.java.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorLifecycleTest {

    private Calculator calculator;

    // 🛠️ Setup method – runs BEFORE every test
    @Before
    public void setUp() {
        calculator = new Calculator();  // Arrange (shared setup)
        System.out.println("Setup complete.");
    }

    // 🧹 Teardown method – runs AFTER every test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete.");
    }

    // ✅ Test using AAA pattern
    @Test
    public void testAdd() {
        // Arrange - done in @Before

        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testAddZero() {
        int result = calculator.add(0, 0);
        assertEquals(0, result);
    }
}

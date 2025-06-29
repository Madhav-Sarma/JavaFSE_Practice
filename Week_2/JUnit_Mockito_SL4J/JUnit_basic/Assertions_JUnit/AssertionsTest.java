package Week_2.JUnit_Mockito_SL4J.JUnit_basic.Assertions_JUnit;

import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}

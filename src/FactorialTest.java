import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    @DisplayName("5 should return 120")
    void test5ShouldReturn120() {
        assertEquals(120, Factorial.intFactorial(5));
    }

    @Test
    @DisplayName("0 should return 1")
    void test0ShouldReturn1() {
        assertEquals(1, Factorial.intFactorial(0));
    }

    @Test
    @DisplayName("Negative should throw IllegalArgumentException")
    void testNegativeShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.intFactorial(-5));
    }
}
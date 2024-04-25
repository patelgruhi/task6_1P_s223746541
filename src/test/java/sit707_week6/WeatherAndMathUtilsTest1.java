package sit707_week6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class WeatherAndMathUtilsTest1 {

    @Test
    public void testMultiplyUpToN() {
        assertEquals(24, WeatherAndMathUtils1.multiplyUpToN(4));
        assertEquals(120, WeatherAndMathUtils1.multiplyUpToN(5));
        assertEquals(720, WeatherAndMathUtils1.multiplyUpToN(6));
        assertEquals(5040, WeatherAndMathUtils1.multiplyUpToN(7));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, WeatherAndMathUtils1.factorial(0));
        assertEquals(1, WeatherAndMathUtils1.factorial(1));
        assertEquals(2, WeatherAndMathUtils1.factorial(2));
        assertEquals(6, WeatherAndMathUtils1.factorial(3));
        assertEquals(24, WeatherAndMathUtils1.factorial(4));
        assertEquals(120, WeatherAndMathUtils1.factorial(5));

        try {
            WeatherAndMathUtils1.factorial(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }
}
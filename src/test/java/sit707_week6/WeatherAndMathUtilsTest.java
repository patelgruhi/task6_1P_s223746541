package sit707_week6;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "s223746541";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "gruhi";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testIsEven() {
		assertEquals(true, WeatherAndMathUtils.isEven(2));
		assertEquals(false, WeatherAndMathUtils.isEven(1));
		assertEquals(true, WeatherAndMathUtils.isEven(0));
		
	}
	@Test
	public void testWeatherAdvice() {
		assertEquals("CANCEL ALERT", WeatherAndMathUtils.weatherAdvice(71.0, 0.0));
		assertEquals("WARN ALERT", WeatherAndMathUtils.weatherAdvice(46.0, 0.0));
		assertEquals("ALL CLEAR ALERT", WeatherAndMathUtils.weatherAdvice(44.0, 0.0));
		assertEquals("CANCEL ALERT", WeatherAndMathUtils.weatherAdvice(0.0, 7.0));
		assertEquals("WARN ALERT", WeatherAndMathUtils.weatherAdvice(0.0, 5.0));
		assertEquals("ALL CLEAR ALERT", WeatherAndMathUtils.weatherAdvice(0.0, 3.0));
		assertEquals("CANCEL ALERT", WeatherAndMathUtils.weatherAdvice(71.0, 5.0));
		assertEquals("CANCEL ALERT", WeatherAndMathUtils.weatherAdvice(46.0, 5.0));
	}
	
	@Test
	 public void testIsPrime() {
	        assertEquals(true, WeatherAndMathUtils.isPrime(7));
	        assertEquals(false, WeatherAndMathUtils.isPrime(9));
	        assertEquals(false, WeatherAndMathUtils.isPrime(1));
	        assertEquals(false, WeatherAndMathUtils.isPrime(0));
	        assertEquals(false, WeatherAndMathUtils.isPrime(-2));
	    }
}
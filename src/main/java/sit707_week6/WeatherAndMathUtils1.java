package sit707_week6;

public class WeatherAndMathUtils1 {

    
    public static int multiplyUpToN(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial for negative numbers.");
        }

        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }
}
	

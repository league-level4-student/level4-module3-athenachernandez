package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ExceptionMethods {
	//2. In the ExceptionMethods class, write a method called divide that takes
		//   two doubles as parameters and returns their quotient as a double. This method 
		//   should throw an IllegalArgumentException if the denominator is 0.0.
	public double divide(double x, double y) {
		if (y == 0.0) {
			throw new IllegalArgumentException();
		} else {
			double quotient = x / y;
			return quotient;
		}
		

	}
	
	// 4. In the ExceptionMethods class, write a method called reverseString that
		// takes a
		// String and returns the reverse of that String. It should throw an
		// IllegalStateException
		// if the String passed in is empty
	
	public String reverseString(String str) {
		String reverseStr = "";
		if (!str.isEmpty()) {
			for (int i = str.length()-1; i >=0; i--) {
				reverseStr += str.charAt(i);
			}
			return reverseStr;
		} else {
			throw new IllegalStateException();
		}	
	}
	
}

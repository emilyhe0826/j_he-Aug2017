/*Emily He
 * September 6, 2017
 * Our self written Math Library
 * In Calculate,it will calculate series 
 * of method to do basic math functions. 
*/
public class Calculate {
	//Part 1
	//square the input
	public static int square (int operand) {
		int squared = operand*operand;
		return squared;
	}
	
	//cube the input
	public static int cube (int operand) {
		int cubed = operand*operand*operand;
		return cubed;
	}
	
	//average the 2 input and return its average
	public static double average(double a, double b) {
		return (a+b)/2;
	}
	
	//average the 3 input and return its average 
	public static double average(double a,double b, double c) {
		return (a+b+c)/3;
	}
	
	//convert radian to degrees
	public static double toDegrees (double radian) {
		double pi = 3.14159;
		return radian *(360/(2*pi));
	}
	
	// this method convert degrees to radian
	public static double toRadians (double degrees) {
		double pi = 3.14159;
		return degree *((2*pi)/360);
	}
	
	//this method takes 3 coefficeint and return the value of the discriminant.
	public static double discriminant (double a,double b, double c) {
		return (b*b)-4*a*c;
	}
	
	/*this method takes 3 integer and return a string 
	 * where it shows the proper fraction
	 */
	public static String toImproperFrac(int a,int b, int c) {
		int numerator = a*c+b;
		int denominator = c;
		String improper;
		improper = numerator + "/" + denominator;
		return improper;
	}
	
	// this method convert improper fraction to mixed number
	public static String toMixedNum(int top,int bottom) {
		int wholeNum = top/bottom;
		int numerator = top-wholeNum*bottom;
		int denominator = bottom;
		String mixedNum = wholeNum + "_" + numerator + "/" + denominator;
		return mixedNum;
	}
	
	/*convert a binomial multiplication into a quadratic equation,
	 * the method accept four(4) integer 
	 * and a string and then return a string
	 */
	public static String foil(int a,int b,int c, int d, String n) {
		int firstCoef = a*c;
		int secondCoef = a*d-b*c;
		int constantNum = b*d;
		String quadratic = firstCoef + n + "^2 + " +secondCoef + n + " +" + constantNum;
		return quadratic;
	}	
	//Part 2
	
	 // accepts two integers and returns a boolean
	 // determines whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy (int num1, int num2) {
		if (num2 == 0 || num1 == 0) {
			throw new IllegalArgumentException("divisor : 0");
		}
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// accepts a double and returns a double
	// returns the absolute value of the number passed
	public static double absValue (double a) { 
		if (a > 0) {
			return a;
		} else {
			return a*-1;
		}
	}
	
	// accepts two integers and returns a boolean
	// returns the larger of the values passed
	public static int max (int num1, int num2) { 
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	// accepts three doubles and returns a double
	// returns the largest of the values passed
	public static double max (double number1, double number2, double number3) { 
		if (number1 > number2 && number1 > number3) {
			return number1;
		} else if (number2 > number1 && number2 > number3) {
			return number2;
		} else {
			return number3;
		}
	}
	
	// accepts two integers and returns an integer
	// returns the smaller of the values passed
	public static int min (int number1, int number2) { 
		if (number1 < number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	// accepts and returns a double
	// rounds a double correctly to 2 decimal places
	public static double round2 (double a) {  
		double intnumber = (int)(a*100);
		return intnumber/100;
	}
	// Part 3: Methods that use Loops and Calls to Other Methods
	
	public static double exponent (double base, int power) { // accepts a double and an integer and returns a double
		// raises a value to a positive integer power
		if (power < 0) {
			throw new IllegalArgumentException("negative exponent: " + power);
		}
		double answer = 1;
		for (int i = 1; i <= power; i++) {
			answer *= base;
		}
		return answer;
	}
	
	public static int factorial (int a) { // accepts an integer and returns an integer
		// returns the factorial of the value passed
		if (a < 0) {
			throw new IllegalArgumentException("negative a: " + a);
		}
		int answer = 1;
	    for ( int i = 2; i <= a; i++ ) {  
	        answer *= i;
	    }  
	    return answer;
	}  
	
	public static boolean isPrime (int a) { // accepts an integer and returns a boolean
		// determines whether or not an integer is prime
	    boolean check;
	    if (a > 1) {
	    	for (int i = a - 1; i > 1; i--) {
	    		check = Calculate.isDivisibleBy(a, i);
	    		if (check == true) {
	    			return false;
	    		}
	    	}
	    } else {
	    	return false;
	    }
	    return true;
		}

	public static int gcf (int num1, int num2) { // accepts two positive integers and returns an integer
		// finds the greatest common factor of two integers
		while (num2 != 0) {
			int c = num1;
			num1 = num2;
			num2 = c % num2;
		}
		return (int)Calculate.absValue(num1);
	}
	
	public static double sqrt (double a) { // accepts and returns a double
		// returns an approximation of the square root of the value passed, accurate to two decimal places
		if (a < 0) {
			throw new IllegalArgumentException ("negative a:" + a);
		}
		return Math.sqrt(a);
	}
// Part 4: Throwing Exceptions
		// 1. See factorial, exponent, isDivisibleBy, and sqrt
		// 2.
	public static String quadForm (int a, int b, int c) { // accepts three integers and returns a String
		// uses the coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate the real roots
		double answer = Calculate.discriminant(a, b, c);
		double discriminantRoot = Calculate.sqrt(answer);
		double root1 = (-b + discriminantRoot) / (2 * a);
		double root2 = (-b - discriminantRoot) / (2 * a);
		if (answer < 0) {
		   return ("no real roots");
		} else if (answer > 0) {
		   return (root1 + " and " + root2);
		} else if (answer == 0) {
		   return (root1 + " ");
		}
	    return 0 + "";
		}
	
}

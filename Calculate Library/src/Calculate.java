/*Emily He
 * September 6, 2017
 * Our self written Math Library
 * In Calculate,it will calculate series 
 * of method to do basic math functions. 
*/
public class Calculate {
	
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
	
	
}

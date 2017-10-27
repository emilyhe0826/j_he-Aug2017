/*Emily He
 * October 16, 2017 
 * Write a runner class that will test the 
 * result of the quadratic methods.
 * And print out the result in 
 * it receives form QuadrDescriber. 
*/

import java.util.*;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the Quadratic Describer\nProvide values for coefficients a, b, and c\n");
		
		boolean done = false;
		
		while(!done) {
			System.out.print("a: ");
			double coefA = userInput.nextDouble();
			System.out.print("b: ");
			double coefB = userInput.nextDouble() ;
			System.out.print("c: ");
			double coefC = userInput.nextDouble();
		
			System.out.println(Quadratic.quadrDescriber(coefA, coefB, coefC));
		
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String exit = userInput.next();
			if(exit.equals("quit")) {
				done = true;
			}
			System.out.println();
		}
	}
}

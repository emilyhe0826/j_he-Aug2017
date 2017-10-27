/*Emily He
 * October 4, 2017
 * Our Collaborative programming Exercise
 * In the method created titled Processing Numbers, 
 * it would print out the minimum and maximum value 
 * along with the sum of even numbers and the maximum 
 * even number from the user's input.
*/

import java.util.*;

public class ProcessingNumbers {
	public static void main (String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.print("How many numbers are you entering? ");
		int inputNumber = userInput.nextInt();
		System.out.print("Enter your numbers.");
		int max = userInput.nextInt();
		int min = max;
		int sumEven = 0;
		int maxEven = 0;
		if (max % 2 == 0) {
			sumEven = max;
			maxEven = max;
		} 
		
		for (int i = 2; i <= inputNumber; i++) {
			int next = userInput.nextInt();
			if (next > max) {
				max = next;
			} if (next < min) {
				min = next;
			} if (next % 2 == 0) {
				sumEven += next;
				maxEven = next;
			} 
		}   
			System.out.println("This is the largest even number: " + maxEven);
			System.out.println("This is the smallest number: " + min);
			System.out.println("This is the largest number: " + max);
			System.out.println("This is the sum of all the even numbers: " + sumEven);
	}
}
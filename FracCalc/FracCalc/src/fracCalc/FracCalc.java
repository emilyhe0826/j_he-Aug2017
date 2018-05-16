/* Emily He
 * Ms.Dreyer
 * APCS2
 * 12/18/2017
 * This class calculate two fractions from user's input. 
 * Applying object to FracCalc. 
 */
package fracCalc;
import java.util.Scanner;

public class FracCalc {
	public static void main(String[] args) {
    	//Repeat until the user types "quit"
    	Scanner console = new Scanner(System.in);
    	boolean incomplete = true;
    	while(incomplete) {
    		System.out.println("Enter your equation, with mixed fractions in the form \"Whole Number_Numerator/Denominator\", or enter quit"); 
    		System.out.println("The valid operators are +, -, *, and /.");
    		String input = console.nextLine();
    		if(input.equals("quit")) {
    			incomplete = false;
    		} else {
    			System.out.println(produceAnswer(input));
    		}
    	}
    }
	
	public static String produceAnswer(String input){ 
		// split to different parts
        String[] splitInput = input.trim().split(" ");
        if(splitInput.length % 2 == 0) {
        	return "ERROR: The number for operators and operands is invalid.";
        }
        Fraction firstOperand = new Fraction(splitInput[0]);
        for(int i = 0; i * 2 + 1 < splitInput.length; i++) {

        	Fraction secondOperand = new Fraction(splitInput[2]);
        	if(splitInput[1].equals("+")) {
        		fracAddition(firstOperand, secondOperand);
        	} else if(splitInput[1].equals("-")) {
        		secondOperand.flipSign();
        		fracAddition(firstOperand, secondOperand);
        	} else if(splitInput[1].equals("*")) {
        		fracMultiplication(firstOperand, secondOperand);
        	} else if(splitInput[1].equals("/")) {
        		secondOperand.setReciprocal();
        		fracMultiplication(firstOperand, secondOperand);
        	} else {
        		return "ERROR: Invalid operator or incorrect format.";
        	}
        	for(int j = 1; j < splitInput.length - 2; j++) {
	        	splitInput[j] = splitInput[j + 2];
	        }
        }
        return firstOperand.toString();   
    }
  
    public static void fracAddition(Fraction firstOperand, Fraction secondOperand) {
	    	int num1 = firstOperand.getNumerator();
	    	int denom1 = firstOperand.getDenominator();
	    	int num2 = secondOperand.getNumerator();
	    	int denom2 = secondOperand.getDenominator();
	    	firstOperand.setDenominator(denom1 * denom2);
	    	firstOperand.setNumerator(num1 * denom2 + denom1 * num2);
    }
    
    public static void fracMultiplication(Fraction firstOperand, Fraction secondOperand) {

    	firstOperand.setNumerator(firstOperand.getNumerator() * secondOperand.getNumerator());
    	firstOperand.setDenominator(firstOperand.getDenominator() * secondOperand.getDenominator());
    }
    
}
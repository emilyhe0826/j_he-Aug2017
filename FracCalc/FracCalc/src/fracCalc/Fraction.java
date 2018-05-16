/*Emily He
 * Ms.Dreyer
 * APCS2
 * 12/18/2017
 * This class calculate two fractions from user's input. 
 * Applying object to FracCalc. 
 * Creating a new class called Fraction that stores private variables.
 */
package fracCalc;

class Fraction {
	private int numerator = 0;
	private int denominator = 1;
	private int wholeNum = 0;
	
	//constructor
	public Fraction(String fraction){
		int whole = 0;
		int underscoreLocation = fraction.indexOf("_");
        int slashPosition = fraction.indexOf("/");
        if(underscoreLocation >= 0) {
        	whole = Integer.parseInt(fraction.substring(0, underscoreLocation));
        	numerator = Integer.parseInt(fraction.substring(underscoreLocation + 1, slashPosition));
        	denominator = Integer.parseInt(fraction.substring(slashPosition + 1));
        } 
        else if(slashPosition >= 0) {
        	numerator = Integer.parseInt(fraction.substring(0, slashPosition));
    		denominator = Integer.parseInt(fraction.substring(slashPosition + 1, fraction.length()));
        } 
        else {
        	whole = Integer.parseInt(fraction);
        }
        if(whole < 0) {
        	numerator *= -1;
        }
        numerator += whole * denominator;
	}

	public String toString(){
		//Simplifying the fraction from improper to mixed number
    	 for(int i = Math.abs(denominator); i > 1; i--) {
    		if(numerator % i == 0 && denominator % i == 0) {
    			numerator = numerator / i;
    			denominator = denominator / i;
    		}
    	}
    	 //calculation
		int whole = numerator / denominator;
		numerator = numerator % denominator;
		if(whole != 0) {
    		numerator = Math.abs(numerator);
    		denominator = Math.abs(denominator);
    	} 
    	else if(denominator < 0){
    		numerator *= -1;
    		denominator = Math.abs(denominator);
    	}
        if(whole == 0) {
        	if(numerator == 0) {
        		return "0";
        	}else {
        		return numerator + "/" + denominator;
        	}
        }else if(numerator == 0) {
        	return "" + whole;
        }else {
        	return whole + "_" + numerator + "/" + denominator;
        }
	}
	
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	//for dividing two fraction, use this.______
	public void setReciprocal() {
		int numerator = this.numerator;
		this.numerator = this.denominator;
		this.denominator = numerator;
	}
	
		//positive or negative 
	public void flipSign() {
		numerator *=-1;
	}
}
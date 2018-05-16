/*Emily He
 * February 26,2018
 * Prism Programming Exercise 
 */

/*Create a new class called ThreeDShape. Start with the code below. 
 *Complete it and adjust your other code to accommodate it. Write a Sphere class.
*/

public abstract class ThreeDShape {
	private double volume;
	private double surfaceArea;

	public ThreeDShape(){
		this.volume = calcVolume();
		this.surfaceArea = calcSA();
	}
	
	public abstract double calcVolume();
	public abstract double calcSA();
	
	public double getVolume() {
		return volume;
	}

	public void setVolume( double volume) {
		this.volume = volume;
	}
	
	public double getSurfaceArea() {
		return surfaceArea;
	}
	
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
}
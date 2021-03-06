/*Emily He
 * February 26,2018
 * Prism Programming Exercise with ThreeDShape
 */

public class Sphere extends ThreeDShape {
	
	private double radius;
	
	public Sphere(double rad) {
		super();
		this.radius = rad;
	}
	
	public double calcVolume() {
		return (Math.PI * radius * radius * radius * 4) / 3;
	}
	
	public double calcSA() {
		return Math.PI * radius * radius * 4;
	}
}
/* Emily He
 * April 13, 2018
 * PercentCell class
 */
package textExcel;

public class PercentCell extends ValueCell{
	private double decimal;
	//constructor 
	public PercentCell(String cellText) {
		super(cellText);
		//convert decimal to percent form
		decimal=Double.parseDouble(cellText.substring(0,cellText.length()-1));
		String percentDecimal=(decimal/100.0)+"";
		//changes the cell text field to be equal to the percent as a decimal
		setCellText(percentDecimal);
	}
	public String abbreviatedCellText() {
		String realDecimal=decimal+"";
		//truncates the decimal
		String realDecimalPart=realDecimal.substring(0,realDecimal.indexOf("."));
		String result=realDecimalPart;
		//if the truncated version of the percent is less than 9 (length)
		if(realDecimal.length()<9) {
			result+="%";
			for(int i=0; i<9-realDecimalPart.length();i++) {
				result+=" ";
			}
			return result;
		}else {
			return realDecimal.substring(0, 9)+"%";
		}
	
	}
}
/* Emily He
 * April 13, 2018
 * TextCell class
 */
package textExcel;

public class TextCell implements Cell {
	private String cellText;
	public TextCell(String cellText) {
		this.cellText=cellText;
	}
	//return abbreviated version of the text with only 10 character displayed
	public String abbreviatedCellText() { 
		if(cellText.contains("\"")) {
			if(cellText.length()<12) {
				String result=cellText.substring(1,cellText.length()-1);
				for(int i=0; i<(12-cellText.length());i++) {
					result+=" ";
				}
				return result;
			}else {
				return cellText.substring(1,11);
			}
		}else {
			return cellText.substring(0,10);
		}
		
	}
	
	//display the full text without being truncated
	public String fullCellText() {
		return cellText;
	}
}
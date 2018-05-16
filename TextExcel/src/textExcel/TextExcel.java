/* Emily He
 * April 13, 2018
 * TextExcel class
 */

package textExcel;

import java.util.Scanner;


public class TextExcel{
		//forming the structure of the cells
	public static void main(String[] args){
	    Scanner userInput=new Scanner(System.in);
	    //TestsALL.Helper x = new TestsALL().Helper();
	    //System.out.println(x.getText());
	    Spreadsheet grid=new Spreadsheet();
	    boolean done=true;
	    while(done) {
        	String input=userInput.nextLine();
	        	if(input.equals("quit")){
	        		done=false;
	        	}else{
	        		System.out.println(grid.processCommand(input));
	        	}
	    } 
	}
}
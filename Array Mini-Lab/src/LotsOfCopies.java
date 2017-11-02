import java.util.Arrays;
/* Emily He
 * October 31, 2017
 * Array Mini_Lab Activity
 * Lots of Copies 
 */

public class LotsOfCopies {
	public static void main (String [] args){
		int num = 7;
		//Test:
		//int num2 = num;
		//num = 5;
		//System.out.println(num2);
		
		String strMain = "APCS";
		
		//State:
		//String str2 = strMain;
		//strMain = "hi";
		//System.out.println(str2);
		
		int [] arrMain = {1,2,3,4,5};
		
		//int [] arr2 = arrMain;
		//arrMain [0] = 19;
		//System.out.println(Arrays.toString(arr2));
		
		changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
	}
	
	public static void changeMe(int x, String str, int [] arr){
		x = 20;
		str = "Blue";
		arr [0] = 19;
	}
	

}
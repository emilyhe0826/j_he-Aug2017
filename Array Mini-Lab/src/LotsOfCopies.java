import java.util.Arrays;

/* Emily He
 * October 31, 2017
 * Array Mini_Lab Activity
 * Lots of Copies 
 */

public class LotsOfCopies {
	public static void main (String [] args){
		int num = 7;
		String strMain = "APCS";
		int [] arrMain = {1,2,3,4,5};
		
		changeMe(num, strMain, arrMain);
		/*
		System.out.println("The result in Main, num: "+ num);
		System.out.println("The result in Main, strMain: "+strMain);
		System.out.println("The result in Main, arrMain:"+ Arrays.toString(arrMain));
		*/
		
	}
	
	public static void changeMe(int x, String str, int [] arr){
		
		/*PART 1
		System.out.println("In changeMe, before the change, num (aka x): " + x);
		x = 4;
		System.out.println("In changeMe, after the change, num (aka x): " + x);
		
		System.out.println("In changeMe, before the change, strMain (aka str): " + str);
		str = "Blue";
		System.out.println("In changeMe, after the change, strMain (aka str): " + str);
		
		System.out.println("In changeMe, before the change, arrMain (aka arr): " + Arrays.toString(arr));
		arr [0] = 19;
		System.out.println("In changeMe, after the change, arrMain (aka arr): " + Arrays.toString(arr));
		*/
		
		//PART 2
		
			//a=start
			//b=a
			//a==new
			//what does b==?
		
			//integer
			x=3;
			int bint = x;
			x=23;
			System.out.println("b:"+ bint);
			
			//String
			str="hhhh";
			String bstr= str;
			str="Ahhhhh";
			System.out.println("bstr:"+ bstr);
			//Integer and strings behave the same
			
			//Array
			int [] barr= arr;
			arr[0]=200;
			System.out.println("barr:"+ Arrays.toString(barr));
			//Unlike Integer and strings, Array just creates a new name.(Passing by reference)
	}
	

}
import java.util.Arrays;

//Emily He
//October 26, 2017
//String Split Assignment

	// Your task Part 0



	//String.split();
	//It's a method that acts on a string, <StringName>.split(<String sp>);
	//Where sp is the string where the string splits
	//And it returns an array
	// Example: "I like apples!".split(" "); 
	//	it will split at spaces and return an array of ["I","like","apples!"]
	// Example 2: "I really like really red apples".split("really")
	//	it will split at the word "really" and return an array of ["I "," like "," red apples!"]
	//play around with String.split! 
	//What happens if you "I reallyreally likeapples".split("really") ?

public class Split {
	public static void main(String[] args) {
		// testing Example1:
		String example = new String ("I like apples!");
		String[] array = example.split(" ");
		System.out.println(Arrays.toString(array));
		// testing Example2:
		String example2 = new String ("I really like really red apples");
		String[] array2 = example2.split("really");
		System.out.println(Arrays.toString(array2));
		// task1:
		task1("applespineapplesbreadlettucestomatobaconmayohambreadcheese");
		task1("applesbreadtomatobreadcheese");
		task1("breadbreadbread");
		task1("breadbread");
		task1("bread");
				
		// task2:
		task2("apples pineapples bread lettuces tomato bacon mayo ham bread cheese");
		task2("apples bread tomato bread cheese");
		task2("breadbreadbread");
		task2("breadbread");
		task2("bread");
		
	}
	
	//Your task Part 1:
	/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
	* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
	* What if it's a fancy sandwich with multiple pieces of bread?
	*/
	public static void task1(String sandwich){ 
		int bread1 = sandwich.indexOf("bread");
		int bread2 = sandwich.indexOf("bread", bread1 + 5);
		if(bread1 < 0 && bread1 >=0 && bread2 < 0){
			System.out.println("Not a sandwich");
		} else if(bread1 == 0) {
			System.out.println("Not a sandwich");
		} else if (bread1+5 == bread2) {
			System.out.println("Not a sandwich");
		} else {
			System.out.println(sandwich.substring(bread1+5, bread2));
		}
	}

	//Your task Part 2:
	/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
	* Again, what if it's a fancy sandwich with multiple pieces of bread?
	*/
	public static void task2(String sandwich){ 
		int bread1 = sandwich.indexOf("bread");
		int bread2 = sandwich.indexOf("bread", bread1 + 6);
		if(bread1 < 0 && bread1 >=0 && bread2 < 0){
			System.out.println("Not a sandwich");
		} else if (bread1+6 == bread2) {
			System.out.println("Not a sandwich");
		} else if(bread1 == 0) {
			System.out.println("Not a sandwich");
		} else {
			System.out.println(sandwich.substring(bread1+6, bread2));
		}
	}
}

package _03_More_Array_Fun;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] stringa= {"aa","bb","cc"};
		arraystring(stringa);
		
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	//public static void arraystring(String [] values) {	

		//for (int i = 0;i<values.length;i++) {
			//System.out.println(values[i]);
		//}
		
		
	//}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	//public static void arraystring (String []pp) {
		
		//for(int i = pp.length-1;i>=0;i--) {
		//	System.out.println(pp[i]);
		//}
	
	//}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
//	public static void arraystring(String [] values) {	
//		
//			for (int i = 0;i<values.length;i+=2) {
//				System.out.println(values[i]);
//			}
//	
//		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void arraystring(String [] values) {
		List<String> tmpList = Arrays.asList(values);
		Collections.shuffle(tmpList);
		for (int i = 0;i<tmpList.size();i++) {
			System.out.println(tmpList.get(i));
		}
		
	}
	
}

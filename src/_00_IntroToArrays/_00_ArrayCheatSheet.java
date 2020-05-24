package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String []letters= {"aa","bb","cc","dd","ee"};
		//2. print the third element in the array
System.out.println(letters[2]);
		//3. set the third element to a different value
letters[2]="zz";
		//4. print the third element again
		System.out.println(letters[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i=0;i<letters.length;i++) {
			letters[i]="yy";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<letters.length;i++) {
			System.out.println(letters[i]);
		}
		//7. make an array of 50 integers
		int [] numbers=new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i=0;i<numbers.length;i++) {
			Random r=new Random();
			int x=r.nextInt(100);
			numbers[i]=x;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int small=101;
		for (int i=0;i<numbers.length;i++) {
			if (numbers[i]<small) {
				small=numbers[i];
			}
		}
		System.out.println(small);
		//10 print the entire array to see if step 8 was correct
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		//11. print the largest number in the array.
		int big=1;
		for (int i=0;i<numbers.length;i++) {
			if (numbers[i]>big) {
				big=numbers[i];
			}
		}
		//12. print only the last element in the array
				System.out.println("biggest number"+big);
	}
}

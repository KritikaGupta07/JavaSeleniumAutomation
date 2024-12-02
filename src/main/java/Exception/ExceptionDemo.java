package Exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		//Unchecked Exception(Runtime Exception)
				
		System.out.println("Program Started...");
		
		//1. Arithmetic Exception
		
		// Giving number = 0 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number= ");
		
		int num = sc.nextInt();
		
		System.out.println("Result = " + 100/num);
		
		//2. ArrayIndexOutOfBound Exception
		
		// If giving position more than 4 
		
		int[] arr = new int[5];
		
		System.out.println("Enter the position (0-4): ");
		
		int pos = sc.nextInt();
		
		System.out.println("Enter the value: ");
		
		int val = sc.nextInt();
		
		arr[pos] = val;
		
		System.out.println("Element : " + arr[pos]);
		
		//3. NumberFormatException 
		
		//Giving 'Welcome' on the place of '12345' it will throw an exception called NumberFormatException 
		
		String s = "12345";
		
		int n = Integer.parseInt(s);
		
//		String s1 = "Welcome";
//		
//		int n = Integer.parseInt(s1);
		
		System.out.println("Converted string into number " + n);
		
		//4. NullPointerException
		
		//If a string is null then it will throw NullPointerException
		
		String s2 = null;
		
		System.out.println("Length of string is : " + s2.length());
		
		System.out.println("Program completed...");
		
		System.out.println("Program is exited...");

	}

}

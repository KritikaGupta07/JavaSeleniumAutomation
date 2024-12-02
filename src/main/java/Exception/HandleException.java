package Exception;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program Started...");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a number: ");
			
			int num = sc.nextInt();
			
			System.out.println("Resultant : " + 100/num);
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Invalid Data...");
			
		}
		
		System.out.println("Program Completed...");
		
		System.out.println("Program Exited");
	}

}

package BreakOutSession;

import java.util.Scanner;

public class GroceryMain {

	public static void main(String[] args) {

		GroceryMethod gm = new GroceryMethod();

		Scanner sc = new Scanner(System.in);

		System.out.println("*************************Grocery Management*******************");
		
		boolean status = false;

		while (!status) {

			System.out.println("Grocery List Manager");
			System.out.println("1. Add item");
			System.out.println("2. Remove item");
			System.out.println("3. View list");
			System.out.println("4. Clear list");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:				

				gm.addItem();

				break;

			case 2:

				gm.removeItem();

				break;

			case 3:

				gm.viewList();

				break;

			case 4:

				gm.clearList();

				break;
				
			case 5:
				
				gm.exit();
				
				status = true;
				
				break;

			default:

				System.out.println("Invalid Choice");

			}
		}

	}

}

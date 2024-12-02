package BreakOutSession;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GroceryMethod {

	Scanner sc = new Scanner(System.in);

	List<String> gl = new LinkedList<String>();

	public void addItem() {

		System.out.println("Enter item to add : ");

		String item = sc.nextLine();

		gl.add(item);

		System.out.println(item + " has been added to the list.");
	}

	public void removeItem() {

		System.out.println("Enter the name of item to remove: ");

		String removeitem = sc.nextLine();
		
		if(gl.contains(removeitem)) {
			
			gl.remove(removeitem);
		}

		System.out.println(removeitem + " has been removed from the list.");
	}

	public void viewList() {
		
		System.out.println("Current Grocery List :");
		
		for(int i = 0 ; i < gl.size() ; i++) {
			
			System.out.println(i+1 + ". " + gl.get(i));
		}

	}

	public void clearList() {
		
		gl.clear();

		System.out.println("The list has been cleared.");
	}
	
	public void exit() {
		
		System.out.println("Exiting Grocery List Manager. Goodbye!");
		
	}

}

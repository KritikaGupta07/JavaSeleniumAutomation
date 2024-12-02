package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListTracker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> shoppingList = new ArrayList<String>();
		
		System.out.println("Enter items for your shopping list (type 'done' for finish): ");
		
		while(true) {
			
			String item = sc.nextLine();
			
			if(item.equalsIgnoreCase("done")) {
				
				break;
			}
			shoppingList.add(item);
		}
		System.out.println("Your shopping list: ");
		
		for(String listItem : shoppingList) {
			
			System.out.println("- " + listItem);
		}
		
		sc.close();

	}

}
